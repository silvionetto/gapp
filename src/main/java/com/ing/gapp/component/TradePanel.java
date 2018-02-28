package com.ing.gapp.component;

import com.ing.gapp.entity.Currency;
import com.ing.gapp.entity.enums.RateType;
import com.ing.gapp.entity.enums.TradeType;
import com.vaadin.event.ShortcutAction;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

public class TradePanel extends CustomComponent {

    private final GridLayout root = new GridLayout(5,5);
    private final Label error = new Label();
    private final ComboBox<TradeType> tradeType = new ComboBox<>("Type:");
    private final ComboBox<Currency> currency = new ComboBox<>("Currency:");
    private final TextField amount = new TextField("Amount:");
    private final ComboBox<RateType> rateType = new ComboBox<>("Rate Type:");
    private final DateField startDate = new DateField("Start Date:");
    private final DateField endDate = new DateField("End Date:");
    private final Button clear = new Button("New");
    private final Button save = new Button("Save");
    private final HorizontalLayout buttons = new HorizontalLayout(clear, save);

    public TradePanel() {
        init();
        initLayout();
        initListeners();
    }

    public void init() {
        tradeType.setItems(TradeType.values());
        tradeType.setItemCaptionGenerator(TradeType::getName);
        tradeType.setEmptySelectionAllowed(false);
        tradeType.setValue(TradeType.DEPOSIT);

        rateType.setItems(RateType.values());
        rateType.setItemCaptionGenerator(RateType::getType);
        rateType.setValue(RateType.FIXED);

    }

    public void initLayout() {
        setSizeUndefined();

        clear.setStyleName(ValoTheme.BUTTON_PRIMARY);

        save.setStyleName(ValoTheme.BUTTON_PRIMARY);
        save.setClickShortcut(ShortcutAction.KeyCode.ENTER);

        root.addComponent(error, 0, 0);
        root.addComponent(tradeType, 0, 1);
        root.addComponent(currency, 0, 2);
        root.addComponent(amount, 1, 2);
        root.addComponent(rateType, 2, 2);
        root.addComponent(startDate, 3, 2);
        root.addComponent(endDate, 4,2);
        root.addComponent(buttons, 0, 3);
        root.setSpacing(true);
        root.setSizeFull();
        root.setMargin(true);
        root.setSizeUndefined();

        setCompositionRoot(root);

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
