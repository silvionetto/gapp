package com.ing.gapp.form;

import com.ing.MyUI;
import com.ing.gapp.service.UserService;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

import static com.vaadin.event.ShortcutAction.KeyCode;

public class LoginForm extends FormLayout {
    private final Label error = new Label();
    private final TextField userName = new TextField("User:");
    private final PasswordField userPassword = new PasswordField("Password:");
    private final Button login = new Button("Login");

    private final UserService userService = UserService.getInstance();
    private final MyUI myUI;

   public LoginForm(MyUI myUI) {
       this.myUI = myUI;

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
       if (user != null && password != null) {
           if (userService.login(user, password)) {
                setVisible(false);
           } else {
               error.setValue("Invalid login or password!");
           }
       } else {
           error.setValue("User or password is empty!");
       }
   }
}
