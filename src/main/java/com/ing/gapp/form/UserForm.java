package com.ing.gapp.form;

import com.ing.gapp.entity.User;
import com.ing.gapp.service.UserService;
import com.vaadin.event.ShortcutAction;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@UIScope
public class UserForm extends FormLayout {
    private final Label error = new Label();
    private final TextField userName = new TextField("User:");
    private final PasswordField userPassword = new PasswordField("Password:");
    private final Button clear = new Button("New");
    private final Button save = new Button("Save");
    private final Button delete = new Button("Delete");

    @Autowired
    private final UserService userService;

    public UserForm(UserService userService) {
        this.userService = userService;

        init();
        initLayout();
        initListeners();
    }

    public void init() {
        HorizontalLayout buttons = new HorizontalLayout(clear, save, delete);
        addComponents(error, userName, userPassword, buttons);
    }

    public void initLayout() {
        setSizeUndefined();

        clear.setStyleName(ValoTheme.BUTTON_PRIMARY);

        save.setStyleName(ValoTheme.BUTTON_PRIMARY);
        save.setClickShortcut(ShortcutAction.KeyCode.ENTER);

        delete.setStyleName(ValoTheme.BUTTON_PRIMARY);
        delete.setClickShortcut(ShortcutAction.KeyCode.DELETE);
    }

    public void initListeners() {
        clear.addClickListener(e -> this.clear());
        save.addClickListener(e -> this.save());
        delete.addClickListener(e -> this.delete());
    }

    public void clear() {
        userName.clear();
        userPassword.clear();
    }

    public void save() {
        System.out.println("Save");
        System.out.println(userName.getValue());
        User user = new User();
        user.setName(userName.getValue());
        user.setPassword(userPassword.getValue());
        userService.save(user);
    }

    public void delete() {
        System.out.println("Delete");
    }
}
