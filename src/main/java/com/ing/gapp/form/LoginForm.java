package com.ing.gapp.form;

import com.ing.gapp.component.Main;
import com.ing.gapp.service.UserService;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.vaadin.event.ShortcutAction.KeyCode;

@Component
@UIScope
public class LoginForm extends FormLayout {
    private final Label error = new Label();
    private final TextField userName = new TextField("User:");
    private final PasswordField userPassword = new PasswordField("Password:");
    private final Button login = new Button("Login");

    @Autowired
    private UserService userService;

    @Autowired
    private Main main;

    @Autowired
    public LoginForm() {

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
                getUI().setContent(main);
            } else {
                error.setValue("Invalid login or password!");
            }
        } else {
            error.setValue("User or password is empty!");
        }
    }
}
