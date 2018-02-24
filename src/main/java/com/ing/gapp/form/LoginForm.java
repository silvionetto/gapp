package com.ing.gapp.form;

import com.ing.MyUI;
import com.ing.gapp.component.Main;
import com.ing.gapp.service.UserService;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

import static com.vaadin.event.ShortcutAction.KeyCode;

public class LoginForm extends FormLayout {
    private final Label error = new Label();
    private final TextField userName = new TextField("User:");
    private final PasswordField userPassword = new PasswordField("Password:");
    private final Button login = new Button("Login");

    private final UserService userService;
    private final MyUI myUI;

    public LoginForm(MyUI myUI, UserService userService) {
        this.myUI = myUI;
        this.userService = userService;

        setSizeUndefined();
        HorizontalLayout buttons = new HorizontalLayout(login);
        addComponents(error, userName, userPassword, buttons);
        login.setStyleName(ValoTheme.BUTTON_PRIMARY);
        login.setClickShortcut(KeyCode.ENTER);

        login.addClickListener(e -> this.login());
    }

    private void login() {
        String user = userName.getValue();
        String password = userPassword.getValue();
        if (user != null && user.length() > 0 && password != null && password.length() > 0) {
            if (userService.login(user, password)) {
                setVisible(false);
                myUI.setContent(new Main());
            } else {
                error.setValue("Invalid login or password!");
            }
        } else {
            error.setValue("User or password is empty!");
        }
    }
}
