package com.example.springbootvaadin;

import com.example.springbootvaadin.api.Currencies;
import com.example.springbootvaadin.api.Currency;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class CurrenciesField extends VerticalLayout {

    public CurrenciesField() {

        Currencies currencies = new Currencies(Currencies.readFromFile().getBaseCurrency(), Currencies.readFromFile().getCurrencies());
        Grid<Currency> gridCurrencies = new Grid<>(Currency.class);
        gridCurrencies.setItems(currencies.getCurrencies());
        add(gridCurrencies);
    }
}
