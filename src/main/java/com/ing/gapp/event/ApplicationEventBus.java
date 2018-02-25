package com.ing.gapp.event;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.SubscriberExceptionContext;
import com.google.common.eventbus.SubscriberExceptionHandler;
import com.ing.MyUI;

/**
 * A simple wrapper for Guava event bus. Defines static convenience methods for
 * relevant actions.
 */
public class ApplicationEventBus implements SubscriberExceptionHandler {

    private final EventBus eventBus = new EventBus(this);


    @Override
    public void handleException(Throwable throwable, SubscriberExceptionContext subscriberExceptionContext) {
        throwable.printStackTrace();
    }

    public static void post(final Object event) {
        MyUI.getEventBus().eventBus.post(event);
    }

    public static void register(final Object object) {
        MyUI.getEventBus().eventBus.register(object);
    }

    public static void unregister(final Object object) {
        MyUI.getEventBus().eventBus.unregister(object);
    }
}
