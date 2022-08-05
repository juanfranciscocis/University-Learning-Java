package com.example.practica_5;

public interface I_Animal {


    //GETTERS AND SETTERS
    public float getHeight();

    public void setHeight(float height);

    public float getWidth();

    public void setWidth(float width);

    public boolean getRun();

    public void setRun(boolean run);

    //DRINKS WATER
    boolean drinkWater(boolean drinksWater);

    //isRunning
    boolean isRunning(boolean isRunning);

    //PUBLIC METHOD -> FLIGHTS
    boolean flights();


}
