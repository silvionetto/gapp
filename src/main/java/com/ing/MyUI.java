package com.ing;

import javax.servlet.annotation.WebServlet;

import com.ing.gapp.component.Main;
import com.ing.gapp.entity.User;
import com.ing.gapp.event.ApplicationEventBus;
import com.ing.gapp.form.LoginForm;
import com.ing.gapp.service.UserService;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.server.VaadinSession;
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
@Title("Gapp")
public class MyUI extends UI {

    private final ApplicationEventBus eventBus = new ApplicationEventBus();

    @Autowired
    private UserService userService;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        //userService.ensureTestData();
        ApplicationEventBus.register(this);

        final LoginForm loginForm = new LoginForm(this, userService);
        final VerticalLayout root = new VerticalLayout();
        root.setSizeFull();
        root.addComponent(loginForm);

        setContent(root);

    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }

    public static ApplicationEventBus getEventBus() {
        return ((MyUI) getCurrent()).eventBus;
    }

    private void updateContent() {
        User user = (User) VaadinSession.getCurrent().getAttribute(User.class.getName());
        if (user != null) {
            setContent(new Main(userService));
            getNavigator().navigateTo(getNavigator().getState());
        } else {

        }
    }
}
