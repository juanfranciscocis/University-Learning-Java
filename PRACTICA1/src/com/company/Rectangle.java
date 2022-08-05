package com.company;

public class Rectangle {

    //MEMBER METHODS
    //CONSTRUCTOR
    public Rectangle(float longA, float longB){
        this.longA = longA;
        this.longB = longB;
    }

    //GETTERS AND SETTERS
    public float getLongA() {
        return longA;
    }

    public void setLongA(float longA) {
        this.longA = longA;
    }

    public float getLongB() {
        return longB;
    }

    public void setLongB(float longB) {
        this.longB = longB;
    }

    //RECTANGLE PERIMETER = CALCULATE THE PERIMETER OF THE RECTANGLE
    public float perimeterRectangle(float longA, float longB){
        return longA + longA + longB + longB;
    }
    //RECTANGLE AREA = CALCULATE THE AREA OF THE RECTANGLE
    public float areaRectangle(float longA, float longB){
        return longA * longB;
    }

    //DATA MEMBERS
    private float longA;
    private float longB;



}
