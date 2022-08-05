package com.example.estudioindependiente_4;

public class C_Car extends C_Automovile {

    //DATA MEMBERS
    private String size;
    private int wheels;
    private boolean trailer;

    //FUCNTION MEMBERS
    public C_Car(String brand, String color, float price, boolean termsAndConditions,String size, int wheels) throws Exception {
        super(brand, color, price, termsAndConditions);
        this.size = size;
        this.wheels = wheels;
        setType("CAR");
        setTrailer(false);

    }

    //GETTERS AND SETTERS
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public boolean isTrailer() {
        return trailer;
    }

    public void setTrailer(boolean trailer) {
        this.trailer = trailer;
    }
}
