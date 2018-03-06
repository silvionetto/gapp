package com.ing.gapp.component;

import com.ing.gapp.entity.Currency;
import com.ing.gapp.entity.Trade;
import com.ing.gapp.entity.enums.RateType;
import com.ing.gapp.entity.enums.TradeType;
import com.ing.gapp.service.CurrencyService;
import com.ing.gapp.util.DateUtil;
import com.vaadin.event.ShortcutAction;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Component
@UIScope
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

    @Autowired
    private CurrencyService currencyService;

    public TradePanel(CurrencyService currencyService) {
        this.currencyService = currencyService;

        init();
        initLayout();
        initListeners();
    }

    public void init() {
        tradeType.setItems(TradeType.values());
        tradeType.setItemCaptionGenerator(TradeType::getName);
        tradeType.setEmptySelectionAllowed(false);
        tradeType.setValue(TradeType.DEPOSIT);

        currency.setItems(getCurrencies());
        currency.setItemCaptionGenerator(Currency::getCode);
        currency.setEmptySelectionAllowed(false);

        rateType.setItems(RateType.values());
        rateType.setItemCaptionGenerator(RateType::getType);
        rateType.setValue(RateType.FIXED);

        startDate.setValue(LocalDate.now());
        endDate.setValue(LocalDate.now());

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
        Trade trade = new Trade();
        trade.setTradeType(tradeType.getValue());
        trade.setTradeCurrency(currency.getValue());
        trade.setTradeAmount(new BigDecimal(amount.getValue()));
        trade.setRateType(rateType.getValue());
        trade.setStartDate(DateUtil.LocalDateToDate(startDate.getValue()));
        trade.setEndDate(DateUtil.LocalDateToDate(endDate.getValue()));
        System.out.println(trade);
    }

    public void delete() {
        System.out.println("Delete");
    }

    public List<Currency> getCurrencies() {
        return currencyService.findAll();
    }
}
