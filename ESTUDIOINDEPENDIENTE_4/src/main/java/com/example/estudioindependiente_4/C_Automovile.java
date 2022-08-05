package com.example.estudioindependiente_4;

public abstract class C_Automovile {

    //DATA MEMBERS
    private String type;
    private String brand;
    private String color;
    private float price;
    private boolean termsAndConditions;

    //FUCNTION MEMBERS
    public C_Automovile(String brand, String color, float price, boolean termsAndConditions) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.termsAndConditions = termsAndConditions;
    }

    //GETTERS AND SETTERS


    public boolean isTermsAndConditions() {
        return termsAndConditions;
    }

    public void setTermsAndConditions(boolean termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
