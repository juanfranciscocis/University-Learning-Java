package com.example.practica_5;

public abstract class C_Animal implements I_Animal {
    //DATA MEMEBERS
    protected float height;
    protected float width;
    protected boolean run;


    //FUNCTION MEMBERS
    public C_Animal(float height, float width, boolean run) {
        this.height = height;
        this.width = width;
        this.run = run;
    }

    //GETTERS AND SETTERS
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public boolean getRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }


    //ABSTRACT METHOD -> DRINK WATER
    public abstract boolean drinkWater(boolean drinksWater);

    //ABSTRACT METHOD -> IS RUNNING
    public abstract boolean isRunning(boolean isRunning);

    //PUBLIC METHOD -> FLIGHTS
    public abstract boolean flights();







}
