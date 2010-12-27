package com.qwertify.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.google.gwt.core.client.GWT;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.TokenFormatException;
import com.gwtplatform.mvp.client.proxy.TokenFormatter;
public final class QwertifyTokenFormatter implements TokenFormatter {

	protected static final String DEFAULT_TOKEN_PREFIX = "!/";
	protected static final String DEFAULT_HIERARCHY_SEPARATOR = "/";
	protected static final String DEFAULT_PARAM_SEPARATOR = ";";
	protected static final String DEFAULT_VALUE_SEPARATOR = "=";

	private final String tokenPrefix;
	private final String hierarchyEscape;
	private final String hierarchyPattern;
	private final String hierarchySeparator;
	private final String paramEscape;
	private final String paramPattern;
	private final String paramSeparator;
	private final String valueEscape;
	private final String valuePattern;
	private final String valueSeparator;

	@Inject
	public QwertifyTokenFormatter() {
		this(DEFAULT_TOKEN_PREFIX, DEFAULT_HIERARCHY_SEPARATOR, DEFAULT_PARAM_SEPARATOR,
				DEFAULT_VALUE_SEPARATOR);
	}

	/**
	 * This constructor makes it possible to use custom separators in your token
	 * formatter. The separators must be 1-letter strings and they must all be
	 * different from one another.
	 * 
	 * @param hierarchySeparator The symbol used to separate {@link PlaceRequest}
	 *          in a hierarchy. Must be a 1-character string.
	 * @param paramSeparator The symbol used to separate parameters in a
	 *          {@link PlaceRequest}. Must be a 1-character string.
	 * @param valueSeparator The symbol used to separate the parameter name from
	 *          its value. Must be a 1-character string.
	 */
	public QwertifyTokenFormatter(String tokenPrefix, String hierarchySeparator,
			String paramSeparator, String valueSeparator) {

		assert hierarchySeparator.length() == 1;
		assert paramSeparator.length() == 1;
		assert valueSeparator.length() == 1;
		assert !hierarchySeparator.equals(paramSeparator);
		assert !hierarchySeparator.equals(valueSeparator);
		assert !paramSeparator.equals(valueSeparator);
		this.tokenPrefix = tokenPrefix;
		this.hierarchySeparator = hierarchySeparator;
		this.paramSeparator = paramSeparator;
		this.valueSeparator = valueSeparator;

		hierarchyPattern = hierarchySeparator + "(?!" + hierarchySeparator + ")";
		hierarchyEscape = hierarchySeparator + hierarchySeparator;

		paramPattern = paramSeparator + "(?!" + paramSeparator + ")";
		paramEscape = paramSeparator + paramSeparator;

		valuePattern = valueSeparator + "(?!" + valueSeparator + ")";
		valueEscape = valueSeparator + valueSeparator;
	}

	@Override
	public String toHistoryToken(List<PlaceRequest> placeRequestHierarchy)
	throws TokenFormatException {
		StringBuilder out = new StringBuilder();
		out.append(this.tokenPrefix);
		
		for (int i = 0; i < placeRequestHierarchy.size(); ++i) {
			if (i != 0) {
				out.append(hierarchySeparator);
			}
			out.append(toPlaceToken(placeRequestHierarchy.get(i)));
		}
	
		return out.toString();
	}

	@Override
	public PlaceRequest toPlaceRequest(String placeToken)
		throws TokenFormatException {
		GWT.log("toPlaceRequest       " + placeToken);
		
		PlaceRequest req = null;
		
		placeToken = placeToken.replaceFirst("[?]", this.paramSeparator);
		int split = placeToken.indexOf(paramSeparator);
		if (split == 0) {
			throw new TokenFormatException("Place history token is missing.");
		} else if (split == -1) {
			req = new PlaceRequest(placeToken);
		} else if (split >= 0) {
			req = new PlaceRequest(placeToken.substring(0, split));
			String paramsChunk = placeToken.substring(split + 1);
			String[] paramTokens = paramsChunk.split(paramPattern);
			String completeParamToken = "";
			for (String paramToken : paramTokens) {
				completeParamToken = completeParamToken + paramToken;

				// Will end with a separator if we had an escaped separator
				if (completeParamToken.endsWith(paramSeparator)) {
					continue;
				}

				String[] param = completeParamToken.split(valuePattern);
				completeParamToken = "";
				String key = "";
				int i = 0;
				for (; i < param.length; ++i) {
					key = key + param[i];

					// Will end with a separator if we had an escaped separator
					if (!key.endsWith(valueSeparator)) {
						break;
					}
				}
				++i;
				String value = "";
				for (; i < param.length; ++i) {
					value = value + param[i];

					// Will end with a separator if we had an escaped separator
					if (!value.endsWith(valueSeparator)) {
						break;
					}
				}
				++i;

				if (i != param.length) {
					throw new TokenFormatException(
							"Bad parameter: Parameters require a single '" + valueSeparator
							+ "' between the key and value.");
				}
				req = req.with(key, value);
			}
		}

		return req;
	}

	@Override
	public List<PlaceRequest> toPlaceRequestHierarchy(String historyToken)
	throws TokenFormatException {
		historyToken = historyToken.substring(historyToken.indexOf(this.tokenPrefix) 
				+ this.tokenPrefix.length(), historyToken.length());
		
		GWT.log("toPlaceRequestHierarchy       " + historyToken);

		List<String> placeTokens = toPlaceTokenList(historyToken);

		List<PlaceRequest> result = new ArrayList<PlaceRequest>();

		for (String placeToken : placeTokens) {
			GWT.log("toPlaceRequestHierarchy       " + placeToken);
			result.add(toPlaceRequest(placeToken));
		}

		return result;
	}

	@Override
	public String toPlaceToken(PlaceRequest placeRequest) {
		String placeToken;
		StringBuilder out = new StringBuilder();
		out.append(placeRequest.getNameToken());

		Set<String> params = placeRequest.getParameterNames();
		if (params != null && params.size() > 0) {
			for (String name : params) {
				out.append(paramSeparator);
				out.append(escape(name)).append(valueSeparator).append(
						escape(placeRequest.getParameter(name, null)));
			}
		}
		GWT.log("toPlaceToken       " + out.toString());
		placeToken = out.toString().replaceFirst(this.paramSeparator, "?");
		return placeToken;
	}

	private String escape(String value) {
		return value.replaceAll(hierarchySeparator, hierarchyEscape).replaceAll(
				paramSeparator, paramEscape).replaceAll(valueSeparator, valueEscape);
	}

	private List<String> toPlaceTokenList(String historyToken)
		throws TokenFormatException {
		String[] placeTokens = historyToken.split(hierarchyPattern);
		List<String> result = new ArrayList<String>();
		String completePlaceToken = "";
		for (String placeToken : placeTokens) {
			completePlaceToken = completePlaceToken + placeToken;

			// Will end with a separator if we had an escaped separator
			if (completePlaceToken.endsWith(hierarchySeparator)) {
				continue;
			}

			result.add(completePlaceToken);
			completePlaceToken = "";
		}
		return result;
	}
}
