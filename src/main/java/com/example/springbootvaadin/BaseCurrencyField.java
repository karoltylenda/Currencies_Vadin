package com.example.springbootvaadin;

import com.example.springbootvaadin.api.Currencies;
import com.vaadin.flow.component.customfield.CustomField;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextArea;

public class BaseCurrencyField extends CustomField<String> {
    private final TextArea codeBaseCurrency = new TextArea();
    private final TextArea valueBaseCurrency = new TextArea();
    private final TextArea nameBaseCurrency = new TextArea();

    public BaseCurrencyField() {
        Currencies currencies = new Currencies(Currencies.readFromFile().getBaseCurrency(), Currencies.readFromFile().getCurrencies());
        setLabel("Base Currency");

        codeBaseCurrency.setValue(currencies.getBaseCurrency().getCode());
        codeBaseCurrency.setReadOnly(true);

        valueBaseCurrency.setValue(currencies.getBaseCurrency().getValue().toString());
        valueBaseCurrency.setReadOnly(true);

        nameBaseCurrency.setValue(currencies.getBaseCurrency().getName());
        nameBaseCurrency.setReadOnly(true);

        HorizontalLayout horizontalLayout = new HorizontalLayout();
        horizontalLayout.add(nameBaseCurrency, valueBaseCurrency, codeBaseCurrency);
        add(horizontalLayout);
    }


    @Override
    protected String generateModelValue() {
        return null;
    }

    @Override
    protected void setPresentationValue(String s) {

    }

}
