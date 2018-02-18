package com.ing;

import javax.servlet.annotation.WebServlet;

import com.ing.gapp.form.LoginForm;
import com.ing.gapp.service.UserService;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@SpringUI
@Theme("mytheme")
public class MyUI extends UI {

    @Autowired
    private UserService userService;

    private LoginForm loginForm;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        //userService.ensureTestData();

        loginForm = new LoginForm(this, userService);

        final VerticalLayout layout = new VerticalLayout();

        layout.addComponent(loginForm);

        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }

}
