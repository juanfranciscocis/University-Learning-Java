package com.example.practica_5;

public class C_Cat extends C_Animal {
    //DATA MEMBERS
    private float retractableNails;

    //FUNCTION MEMBERS
    public C_Cat(float height, float width, boolean run, float retractableNails) {
        super(height, width, run);
        this.retractableNails = retractableNails;
    }

    //GETTERS AND SETTERS
    public float isRetractableNails() {
        return retractableNails;
    }

    public void setRetractableNails(float retractableNails) {
        this.retractableNails = retractableNails;
    }


    //DRINKS WATER -> OVERRIDE
    @Override
    public boolean drinkWater(boolean drinksWater) {
        return drinksWater;
    }

    //IS RUNNING -> OVERRIDE
    @Override
    public boolean isRunning(boolean isRunning) {
        return isRunning;
    }

    @Override
    public boolean flights() {
        return false;
    }
}
