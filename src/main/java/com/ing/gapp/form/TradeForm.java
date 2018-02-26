package com.ing.gapp.form;

import com.ing.gapp.entity.Currency;
import com.ing.gapp.entity.User;
import com.ing.gapp.entity.enums.RateType;
import com.ing.gapp.entity.enums.TradeType;
import com.vaadin.event.ShortcutAction;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

public class TradeForm extends FormLayout {
    private final Label error = new Label();
    private final ComboBox<TradeType> tradeType = new ComboBox<>("Type:");
    private final ComboBox<Currency> currency = new ComboBox<>("Currency:");
    private final TextField amount = new TextField("Amount:");
    private final ComboBox<RateType> rateType = new ComboBox<>("Rate Type:");
    private final DateField startDate = new DateField("Start Date:");
    private final DateField endDate = new DateField("End Date:");
    private final Button clear = new Button("New");
    private final Button save = new Button("Save");

    public TradeForm() {

        init();
        initLayout();
        initListeners();
    }

    public void init() {
        HorizontalLayout buttons = new HorizontalLayout(clear, save);

        tradeType.setItems(TradeType.values());
        tradeType.setItemCaptionGenerator(TradeType::getName);

        rateType.setItems(RateType.values());
        rateType.setItemCaptionGenerator(RateType::getType);

        addComponents(error, tradeType, currency, amount, rateType, startDate, endDate, buttons);
    }

    public void initLayout() {
        setSizeUndefined();

        clear.setStyleName(ValoTheme.BUTTON_PRIMARY);

        save.setStyleName(ValoTheme.BUTTON_PRIMARY);
        save.setClickShortcut(ShortcutAction.KeyCode.ENTER);

    }

    public void initListeners() {
        clear.addClickListener(e -> this.clean());
        save.addClickListener(e -> this.save());
    }

    public void clean() {
    }

    public void save() {
        System.out.println("Save");
    }

    public void delete() {
        System.out.println("Delete");
    }

}
