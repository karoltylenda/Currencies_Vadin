package com.example.springbootvaadin;

import com.example.springbootvaadin.api.Currencies;
import com.example.springbootvaadin.api.Currency;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.TextArea;

import java.text.DecimalFormat;

public class MenuExchange extends VerticalLayout {


    private Currencies currencies = new Currencies(Currencies.readFromFile().getBaseCurrency(), Currencies.readFromFile().getCurrencies());
    private Button buttonExchange = new Button("Exchange");
    private TextArea textAreaSetCash = new TextArea("Base currency to exchange: ");
    private Select<Currency> selectCurrencies = new Select();

    public MenuExchange() {

        selectCurrencies.setLabel("Currencies: ");
        selectCurrencies.setItemLabelGenerator(Currency::getCode);
        selectCurrencies.setItems(currencies.getCurrencies());

        add(textAreaSetCash, selectCurrencies, buttonExchange);

        buttonExchange.addClickListener(buttonClickEvent -> {
            setButtonExchange();
        });

    }

    public String Exchange(Double d1, Double d2){
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        return twoDForm.format(d1/d2);
    }

    public void setButtonExchange(){
        Dialog dialog = new Dialog(new Label("Exchange: "));

        Button buttonOK = new Button("OK", buttonClickEvent1 -> {
            dialog.close();
        });

        VerticalLayout vL = new VerticalLayout();

        TextArea textAreaExchange = new TextArea();
        textAreaExchange.setReadOnly(true);
        textAreaExchange.setValue(Exchange(Double.valueOf(textAreaSetCash.getValue()),selectCurrencies.getValue().getValue()));

        vL.add(textAreaExchange, buttonOK);
        dialog.add(vL);
        dialog.open();
    }
}
