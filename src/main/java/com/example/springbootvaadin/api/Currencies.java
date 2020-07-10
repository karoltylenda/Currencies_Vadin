package com.example.springbootvaadin.api;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;

public class Currencies {

    @SerializedName("baseCurrency")
    @Expose
    private BaseCurrency baseCurrency;
    @SerializedName("currencies")
    @Expose
    private List<Currency> currencies = null;

    public Currencies(BaseCurrency baseCurrency, List<Currency> currencies) {
        this.baseCurrency = baseCurrency;
        this.currencies = currencies;
    }

    public BaseCurrency getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(BaseCurrency baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }

    public static Currencies readFromFile() {
        Gson gson = new Gson();
        Reader reader = null;
        try {
            reader = new FileReader("src\\main\\resources\\currencies.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return gson.fromJson(reader, Currencies.class);
    }

    @Override
    public String toString() {
        return "Currencies{" +
                "baseCurrency=" + baseCurrency +
                ", currencies=" + currencies +
                '}';
    }
}