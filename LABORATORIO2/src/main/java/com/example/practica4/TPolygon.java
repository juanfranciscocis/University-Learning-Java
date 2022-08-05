package com.example.practica4;

public class TPolygon {
    //DATA MEMBERS
    private float widht;
    private float height;


    //FUNCTION MEMBERS
    //CONSTRUCTOR
    public TPolygon(float widht, float height) {
        this.widht = widht;
        this.height = height;
    }

    public TPolygon(){
        this(0,0);
    }

    //GETTERS AND SETTERS
    public float getWidht() {
        return widht;
    }

    public void setWidht(float widht) {
        this.widht = widht;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    //CALC AREA
    public float area(){
        return getWidht() * getHeight();
    }




}
