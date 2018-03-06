package com.ing.gapp.component;

import com.ing.gapp.entity.User;
import com.ing.gapp.service.UserService;
import com.vaadin.event.ShortcutAction;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.shared.ui.ValueChangeMode;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@UIScope
public class UserPanel extends CustomComponent {

    private final FormLayout form = new FormLayout();
    private final Label error = new Label();
    private final TextField userName = new TextField("User:");
    private final PasswordField userPassword = new PasswordField("Password:");
    private final Button clear = new Button("New");
    private final Button save = new Button("Save");
    private final Button delete = new Button("Delete");

    private final VerticalLayout layout = new VerticalLayout();
    private final Grid<User> grid = new Grid<>(User.class);
    private final TextField filterText = new TextField();
    private final Button clearFilter = new Button(VaadinIcons.CLOSE);
    private final CssLayout filtering = new CssLayout();

    @Autowired
    private UserService userService;

    public UserPanel(UserService userService) {
        this.userService = userService;

        init();
        initLayout();
        initListeners();

        updateList();

        setCompositionRoot(layout);
    }

    public void init() {
        HorizontalLayout buttons = new HorizontalLayout(clear, save, delete);
        form.addComponents(error, userName, userPassword, buttons);

        grid.setColumns("id", "name", "version");

        filterText.setPlaceholder("filter by name...");
        filterText.setValueChangeMode(ValueChangeMode.LAZY);

        clearFilter.setDescription("Clear the current filter");

        filtering.addComponents(filterText, clearFilter);

        layout.addComponents(form, filtering, grid);
    }

    public void initLayout() {
        setSizeUndefined();

        clear.setStyleName(ValoTheme.BUTTON_PRIMARY);

        save.setStyleName(ValoTheme.BUTTON_PRIMARY);
        save.setClickShortcut(ShortcutAction.KeyCode.ENTER);

        delete.setStyleName(ValoTheme.BUTTON_PRIMARY);
        delete.setClickShortcut(ShortcutAction.KeyCode.DELETE);

        filtering.setStyleName(ValoTheme.LAYOUT_COMPONENT_GROUP);
    }

    public void initListeners() {
        clear.addClickListener(e -> this.clear());
        save.addClickListener(e -> this.save());
        delete.addClickListener(e -> this.delete());
        filterText.addValueChangeListener(e -> updateList());
        clearFilter.addClickListener(event -> filterText.clear());
        grid.addSelectionListener(event -> {
            Optional<User> user = event.getFirstSelectedItem();
            user.ifPresent(u -> selectUser(u));
        });
    }

    public void clear() {
        userName.clear();
        userPassword.clear();
    }

    public void save() {
        System.out.println("Save");
        User user = new User();
        user.setName(userName.getValue());
        user.setPassword(userPassword.getValue());
        userService.save(user);
        clear();
        updateList();
    }

    public void delete() {
        System.out.println("Delete");
        User user = new User();
        user.setName(userName.getValue());
        userService.delete(user);
        clear();
        updateList();
    }

    public void updateList() {
        List<User> users = userService.findAll(filterText.getValue());
        grid.setItems(users);
    }

    public void selectUser(User user) {
        userName.setValue(user.getName());
        userPassword.setValue(user.getPassword());
    }
}
