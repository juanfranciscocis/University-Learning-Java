package com.example.practica_5;

public class C_Owl extends C_Animal {
    //DATA MEMBERS
    private float flightHeight;


    //FUNCTION MEMBERS
    //CONSTRUCTOR
    public C_Owl(float height, float width, boolean run, float flightHeight) {
        super(height, width, run);
        this.flightHeight = flightHeight;
    }

    //SETTERS AND GETTERS
    public float getFlightHeight() {
        return flightHeight;
    }

    public void setFlightHeight(float flightHeight) {
        this.flightHeight = flightHeight;
    }

    //DRINKS WATTER -> OVERRIDE
    @Override
    public boolean drinkWater(boolean drinksWater) {
        return drinksWater;
    }

    //IS RUNNING -> OVERRIDE
    @Override
    public boolean isRunning(boolean flase) {
        return false;
    }


    //FLIGHTS?
    @Override
    public boolean flights() {
        return true;
    }
}
