package com.example.practica_5;

public class C_Dog extends C_Animal {
    //DATA MEMBERS
    private float fangs;


    //FUNCTION MEMBERS
    //CONSTRUCTOR
    public C_Dog(float height, float width, boolean run, float fangs) {
        super(height, width, run);
        this.fangs = fangs;
    }

    //GETTERS AND SETTERS
    public float getFangs() {
        return fangs;
    }

    public void setFangs(float fangs) {
        this.fangs = fangs;
    }


    //DRINK WATER -> OVERRIDE
    @Override
    public boolean drinkWater(boolean drinksWater) {
        return drinksWater;
    }

    //IS RUNNING -> OVERRIDE
    @Override
    public boolean isRunning(boolean isRunning) {
        this.setRun(isRunning);
        return isRunning;
    }

    @Override
    public boolean flights() {
        return false;
    }


}
