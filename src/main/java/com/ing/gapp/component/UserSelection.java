package com.ing.gapp.component;

import com.ing.gapp.entity.User;
import com.ing.gapp.service.UserService;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.shared.ui.ValueChangeMode;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Class used to list all the users.
 *
 */
@Component
@UIScope
public class UserSelection extends CustomComponent {

    @Autowired
    private UserService userService;

    private Grid<User> grid = new Grid<>(User.class);
    private TextField filterText = new TextField();

    public UserSelection(UserService userService) {
        this.userService = userService;

        final VerticalLayout layout = new VerticalLayout();

        grid.setColumns("id", "name", "version");

        filterText.setPlaceholder("filter by name...");
        filterText.addValueChangeListener(e -> updateList());
        filterText.setValueChangeMode(ValueChangeMode.LAZY);

        Button clearFilter = new Button(VaadinIcons.CLOSE);
        clearFilter.setDescription("Clear the current filter");
        clearFilter.addClickListener(event -> filterText.clear());

        CssLayout filtering = new CssLayout();
        filtering.addComponents(filterText, clearFilter);
        filtering.setStyleName(ValoTheme.LAYOUT_COMPONENT_GROUP);

        layout.addComponents(filtering, grid);

        updateList();

        setCompositionRoot(layout);
    }

    public void updateList() {
        List<User> users = userService.findAll(filterText.getValue());
        grid.setItems(users);
    }
}
