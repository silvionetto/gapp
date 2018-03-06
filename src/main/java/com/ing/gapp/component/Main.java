package com.ing.gapp.component;

import com.vaadin.data.TreeData;
import com.vaadin.data.provider.TreeDataProvider;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@UIScope
public class Main extends CustomComponent {

    @Autowired
    private UserPanel userPanel;
    @Autowired
    private OvernightPanel overnightPanel;
    @Autowired
    private TradePanel tradePanel;

    private final VerticalLayout root = new VerticalLayout();
    private final HorizontalLayout titleBar = new HorizontalLayout();
    private final Label title = new Label("GAPP");
    private final HorizontalLayout horizontalLayout = new HorizontalLayout();
    private final Panel menuContainer = new Panel("Menu");
    private final Tree<String> menu = new Tree("Menu");
    private final TreeData<String> menuData = new TreeData<>();
    private final Panel detailsPanel = new Panel("Details");
    private final HorizontalLayout detailsLayout = new HorizontalLayout();
    private final VerticalLayout detailsBox = new VerticalLayout();

    @Autowired
    public Main() {
        init();
        initLayout();
        initListeners();
    }

    public void init() {

        root.addComponent(getTitleBar());
        root.addComponent(getBody());
    }

    public void initLayout() {
        root.addStyleName("gapp");
        root.setSizeFull();

        titleBar.setWidth("100%");

        title.addStyleName("title");

        horizontalLayout.setSizeFull();
        horizontalLayout.setSpacing(true);
        root.setExpandRatio(horizontalLayout, 1);

        menuContainer.addStyleName("menucontainer");
        menuContainer.addStyleName("light"); // No border
        menuContainer.setWidth("-1px"); // Undefined width
        menuContainer.setHeight("100%");

        menu.setSizeUndefined();
        menu.setWidth("200px");

        detailsPanel.addStyleName("detailspanel");
        detailsPanel.addStyleName("light"); // No borders
        detailsPanel.setSizeFull();

        detailsLayout.setSizeFull();

        detailsBox.setSizeUndefined();
        detailsLayout.setComponentAlignment(detailsBox, Alignment.MIDDLE_CENTER);

        horizontalLayout.setExpandRatio(detailsPanel, 1);
        horizontalLayout.setExpandRatio(menuContainer, 0);


        root.setMargin(true);
        setCompositionRoot(root);
    }

    public void initListeners() {
        menu.addItemClickListener((Tree.ItemClickListener<String>) event -> {
            switch (event.getItem()) {
                case "Home":
                    detailsLayout.removeAllComponents();
                    break;
                case "Trade":
                    detailsLayout.removeAllComponents();
                    detailsLayout.addComponent(tradePanel);
                    break;
                case "Overnight":
                    detailsLayout.removeAllComponents();
                    detailsLayout.addComponent(overnightPanel);
                    break;
                case "User":
                    detailsLayout.removeAllComponents();
                    detailsLayout.addComponents(userPanel);
                    break;
            }
        }
        );
    }

    public HorizontalLayout getTitleBar() {
        titleBar.addComponent(title);
        return titleBar;
    }

    public HorizontalLayout getBody() {
        horizontalLayout.addComponent(getMenuContainer());
        horizontalLayout.addComponent(getDetailsPanel());
        return horizontalLayout;
    }

    public Panel getMenuContainer() {
        menuContainer.setContent(getMenu());
        return menuContainer;
    }

    public Panel getDetailsPanel() {
        detailsPanel.setContent(getDetailsLayout());
        return detailsPanel;
    }

    public VerticalLayout getDetailsBox() {
        final Label home = new Label("Gapp");
        home.setSizeUndefined();
        detailsBox.addComponent(home);
        return detailsBox;
    }

    public HorizontalLayout getDetailsLayout() {
        detailsLayout.addComponent(getDetailsBox());
        return detailsLayout;
    }

    public Tree<String> getMenu() {
        menuData.addItem(null, "Home");
        menuData.addItem(null, "Trade");
        menuData.addItem(null, "Overnight");
        menuData.addItem(null, "Curve");
        menuData.addItem(null, "User");
        menuData.addItem(null, "Logout");

        TreeDataProvider inMemoryDataProvider = new TreeDataProvider<>(menuData);
        menu.setDataProvider(inMemoryDataProvider);

        return menu;
    }
}
