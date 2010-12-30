package com.qwertify.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class HomeView_HomeViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.qwertify.client.view.HomeView>, com.qwertify.client.view.HomeView.HomeViewUiBinder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.qwertify.client.view.HomeView owner) {

    com.qwertify.client.view.HomeView_HomeViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.qwertify.client.view.HomeView_HomeViewUiBinderImpl_GenBundle) GWT.create(com.qwertify.client.view.HomeView_HomeViewUiBinderImpl_GenBundle.class);
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.qwertify.client.editor.EmployeeEditor employeeEditor = (com.qwertify.client.editor.EmployeeEditor) GWT.create(com.qwertify.client.editor.EmployeeEditor.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.qwertify.client.ui.widget.RedButton saveButton = (com.qwertify.client.ui.widget.RedButton) GWT.create(com.qwertify.client.ui.widget.RedButton.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.qwertify.client.ui.widget.Button cancelButton = (com.qwertify.client.ui.widget.Button) GWT.create(com.qwertify.client.ui.widget.Button.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<h1>Home page</h1> <p>This is the home page for this demonstration. You'll always get this page as the default when you come in this showcase.</p> <p>Also try using back of your browser after being in another page !</p> <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla varius malesuada mollis. Nunc elit justo, pellentesque at condimentum a, egestas eget ipsum. Sed pulvinar metus non purus sollicitudin porta. Donec est diam, auctor a feugiat ac, elementum in felis. Donec non fringilla nisi. Etiam sollicitudin sapien vitae ipsum porta dictum blandit metus consectetur. Duis libero est, consectetur in tincidunt eu, ultricies eget dui. Integer felis elit, porttitor at convallis sed, venenatis eu metus. Nam ac metus at nibh placerat interdum vel vel mauris. In lacinia tellus sed leo cursus sodales. Vivamus in purus a nunc fermentum viverra quis non mauris. Nulla nec justo tellus. Maecenas leo velit, bibendum at dapibus at, vulputate et turpis. Sed fringilla interdum libero eu facilisis. Quisque lectus odio, aliquam sed vehicula at, euismod et nunc. Praesent at lacinia tortor.</p> <p>Fusce id blandit augue. Nulla sed velit augue. Vestibulum lectus orci, eleifend non posuere sed, volutpat sit amet metus. Proin at odio et tortor dictum eleifend. Donec dictum egestas sem et tempor. In commodo condimentum pretium. Curabitur congue ipsum vel eros vulputate sed interdum ipsum congue. Pellentesque elementum consectetur mollis. In sollicitudin aliquet dolor at scelerisque. Suspendisse risus leo, vestibulum non euismod a, viverra sed dolor. Nulla facilisi. Sed ut purus ac arcu porttitor feugiat bibendum vel ligula. Morbi fringilla turpis pretium tellus sollicitudin vel volutpat massa sollicitudin. Donec eleifend risus nec mauris pellentesque consectetur. Nulla ornare convallis metus, quis condimentum eros cursus ut. Pellentesque venenatis tellus non felis ullamcorper hendrerit. Praesent semper, nunc eu condimentum interdum, justo nunc semper nulla, nec consequat nisi diam sit amet magna.</p> <p>Nulla non magna id nunc volutpat tincidunt. Morbi sed velit sed elit mattis laoreet. Fusce leo massa, sollicitudin nec hendrerit et, pellentesque vitae tortor. Etiam eu lacus in felis sodales rhoncus. Nulla fermentum sodales arcu sed congue. Nunc molestie, augue et congue pharetra, urna dolor bibendum risus, a consectetur lectus diam ac purus. Nulla convallis mi sit amet elit semper vulputate. Aenean congue, velit eu dapibus molestie, lacus dui lacinia dui, id malesuada nisl turpis eget magna. Curabitur in gravida diam. Etiam viverra ullamcorper sapien et auctor. Praesent tincidunt, nisl at tincidunt imperdiet, nisi est blandit diam, id vulputate lacus nulla et tellus. Quisque ipsum mauris, sollicitudin et facilisis sit amet, placerat fringilla erat. Praesent non condimentum erat. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae;</p> <span id='" + domId0 + "'></span> <span id='" + domId1 + "'></span> <span id='" + domId2 + "'></span>");

    saveButton.setLabel("Save");
    cancelButton.setLabel("Cancel");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(employeeEditor, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(saveButton, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(cancelButton, domId2Element);


    owner.employeeEditor = employeeEditor;
    owner.saveButton = saveButton;

    return f_HTMLPanel1;
  }
}
