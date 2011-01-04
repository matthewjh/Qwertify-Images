package com.qwertify.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class MainPageView_MainPageViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.qwertify.client.view.MainPageView>, com.qwertify.client.view.MainPageView.MainPageViewUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.qwertify.client.view.MainPageView owner) {

    com.qwertify.client.view.MainPageView_MainPageViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.qwertify.client.view.MainPageView_MainPageViewUiBinderImpl_GenBundle) GWT.create(com.qwertify.client.view.MainPageView_MainPageViewUiBinderImpl_GenBundle.class);
    com.qwertify.client.ui.resources.GlobalResources res = (com.qwertify.client.ui.resources.GlobalResources) GWT.create(com.qwertify.client.ui.resources.GlobalResources.class);
    com.qwertify.client.view.MainPageView_MainPageViewUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.qwertify.client.ui.widget.Image f_Image3 = (com.qwertify.client.ui.widget.Image) GWT.create(com.qwertify.client.ui.widget.Image.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel("<div class='" + "" + style.homeBar() + " " + style.outerContainer() + "" + "'> <div class='" + "" + style.container() + "" + "'> <a class='" + "" + style.logoLink() + "" + "' href='#'> <span id='" + domId1 + "'></span> </a> </div> </div> <div class='" + "" + style.navBar() + " " + style.container() + "" + "'> <ul> <li><a class='" + "" + style.currentTab() + "" + "' href='#'>All</a></li> <li><a href='#'>grth</a></li> </ul> </div>");
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.SimplePanel mainContentPanel = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<span id='" + domId0 + "'></span> <div class='" + "" + style.container() + "" + "'> <span id='" + domId2 + "'></span> </div>");

    f_Image3.setResource(res.logoImage());
    f_Image3.setAltText("Qwertify Logo");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    attachRecord0.detach();
    f_HTMLPanel2.addAndReplaceElement(f_Image3, domId1Element);
    UiBinderUtil.TempAttachment attachRecord1 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    attachRecord1.detach();
    f_HTMLPanel1.addAndReplaceElement(f_HTMLPanel2, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(mainContentPanel, domId2Element);


    owner.mainContentPanel = mainContentPanel;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
