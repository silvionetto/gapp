package com.ing.gapp.component;

import com.ing.gapp.entity.Bank;
import com.ing.gapp.service.BankService;
import com.vaadin.ui.*;

import java.util.List;

public class OvernightPanel extends CustomComponent {

    private final GridLayout root = new GridLayout(3, 3);
    private final ComboBox<Bank> bank = new ComboBox<>("Bank:");
    private final TextField amount = new TextField("Amount:");
    private final TextField rate = new TextField("Rate:");
    private final Button clear = new Button("New");
    private final Button save = new Button("Save");
    private final HorizontalLayout buttons = new HorizontalLayout(clear, save);

    private BankService bankService;

    public OvernightPanel(BankService bankService) {
        this.bankService = bankService;

        init();
        initLayout();
    }

    private void init() {
        bank.setItems(getBanks());
        bank.setItemCaptionGenerator(Bank::getName);
        bank.setEmptySelectionAllowed(false);
    }

    private void initLayout() {
        setSizeUndefined();

        root.setSpacing(true);
        root.setSizeFull();
        root.setMargin(true);
        root.setSizeUndefined();

        root.addComponent(bank, 0, 0);
        root.addComponent(amount, 1, 0);
        root.addComponent(rate, 2, 0);
        root.addComponent(buttons, 0, 1);

        setCompositionRoot(root);
    }

    public List<Bank> getBanks() {
        return bankService.findAll();
    }
}
