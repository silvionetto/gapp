package com.ing.gapp.component;

import com.ing.gapp.entity.Bank;
import com.ing.gapp.entity.Overnight;
import com.ing.gapp.service.BankService;
import com.ing.gapp.service.OvernightService;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Component
@UIScope
public class OvernightPanel extends CustomComponent {

    private final GridLayout root = new GridLayout(4, 3);
    private final ComboBox<Bank> bank = new ComboBox<>("Bank:");
    private final TextField amount = new TextField("Amount:");
    private final TextField rate = new TextField("Rate:");
    private final Button clear = new Button("New");
    private final Button save = new Button("Save");
    private final HorizontalLayout buttons = new HorizontalLayout(clear, save);

    private Grid<Overnight> grid = new Grid<>(Overnight.class);


    @Autowired
    private BankService bankService;
    @Autowired
    private OvernightService overnightService;

    public OvernightPanel(BankService bankService, OvernightService overnightService) {
        this.bankService = bankService;
        this.overnightService = overnightService;

        init();
        initLayout();
        initListeners();
        updateList();
    }

    private void init() {
        bank.setItems(getBanks());
        bank.setItemCaptionGenerator(Bank::getName);
        bank.setEmptySelectionAllowed(false);

        grid.setColumns("bank.name", "amount", "rate");
        grid.setSelectionMode(Grid.SelectionMode.SINGLE);
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
        root.addComponent(grid, 0, 2, 3, 2);

        setCompositionRoot(root);
    }

    private void initListeners() {
        clear.addClickListener(event -> clear());
        save.addClickListener(event -> save());

        grid.addSelectionListener(event -> {
            Optional<Overnight> overnight = event.getFirstSelectedItem();
            bank.setValue(overnight.get().getBank());
            amount.setValue(String.valueOf(overnight.get().getAmount()));
            rate.setValue(String.valueOf(overnight.get().getRate()));
        });
    }

    private void updateList() {
        grid.setItems(overnightService.findAll());
    }

    public List<Bank> getBanks() {
        return bankService.findAll();
    }

    public void clear() {
        bank.clear();
        amount.clear();
        rate.clear();
    }

    public void save() {
        System.out.println("Save");
        Overnight overnight = new Overnight();
        overnight.setOvernightDate(new Date());
        overnight.setBank(bank.getValue());
        overnight.setAmount(new BigDecimal(amount.getValue()));
        overnight.setRate(Float.valueOf(rate.getValue()));
        System.out.println(overnight);
        overnightService.save(overnight);
        clear();
        updateList();
    }
}
