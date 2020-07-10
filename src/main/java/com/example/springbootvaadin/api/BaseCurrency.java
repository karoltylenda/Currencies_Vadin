package com.example.springbootvaadin.api;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BaseCurrency {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("value")
    @Expose
    private Double value;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BaseCurrency{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
