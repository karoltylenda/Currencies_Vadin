package com.example.springbootvaadin;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class MenuVerticalLayout extends VerticalLayout {

    public MenuVerticalLayout() {
        
        BaseCurrencyField baseCurrencyField = new BaseCurrencyField();
        CurrenciesField currenciesField = new CurrenciesField();

        add(baseCurrencyField, currenciesField);

    }
}
