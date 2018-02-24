package com.ing.gapp.component;

import com.vaadin.data.TreeData;
import com.vaadin.data.provider.TreeDataProvider;
import com.vaadin.ui.*;

public class Main extends CustomComponent {

    public Main() {
        VerticalLayout root = new VerticalLayout();
        root.addStyleName("gapp");
        root.setSizeFull();

        HorizontalLayout titleBar = new HorizontalLayout();
        titleBar.setWidth("100%");
        root.addComponent(titleBar);

        Label title = new Label("GAPP");
        title.addStyleName("title");
        titleBar.addComponent(title);

        HorizontalLayout horizontalLayout = new HorizontalLayout();
        horizontalLayout.setSizeFull();
        horizontalLayout.setSpacing(true);
        root.addComponent(horizontalLayout);
        root.setExpandRatio(horizontalLayout, 1);

        Panel menuContainer = new Panel("Menu");
        menuContainer.addStyleName("menucontainer");
        menuContainer.addStyleName("light"); // No border
        menuContainer.setWidth("-1px"); // Undefined width
        menuContainer.setHeight("100%");

        horizontalLayout.addComponent(menuContainer);

        Tree<String> menu = new Tree("Menu");
        TreeData<String> menuData = new TreeData<>();
        menu.setSizeUndefined();
        menuContainer.setContent(menu);
        menuContainer.getContent().setWidth("-1px"); // Undefined width

        Panel detailsPanel = new Panel("Details");
        detailsPanel.addStyleName("detailspanel");
        detailsPanel.addStyleName("light"); // No borders
        detailsPanel.setSizeFull();
        horizontalLayout.addComponent(detailsPanel);

        VerticalLayout detailsLayout = new VerticalLayout();
        detailsLayout.setSizeFull();
        detailsPanel.setContent(detailsLayout);

        VerticalLayout detailsBox = new VerticalLayout();
        detailsBox.setSizeUndefined();
        final Label question = new Label("Where is the cat?");
        question.setSizeUndefined();
        detailsBox.addComponent(question);
        detailsLayout.addComponent(detailsBox);
        detailsLayout.setComponentAlignment(detailsBox, Alignment.MIDDLE_CENTER);

        horizontalLayout.setExpandRatio(detailsPanel, 1);
        horizontalLayout.setExpandRatio(menuContainer, 0);

        menuData.addItem(null, "Home");
        menuData.addItem(null,"User");
        menuData.addItem(null,"Logout");

        TreeDataProvider inMemoryDataProvider = new TreeDataProvider<>(menuData);
        menu.setDataProvider(inMemoryDataProvider);

        root.setMargin(true);
        setCompositionRoot(root);

        menu.addItemClickListener(event ->
                Notification.show("Click",
                        Notification.Type.HUMANIZED_MESSAGE)
        );
    }
}
