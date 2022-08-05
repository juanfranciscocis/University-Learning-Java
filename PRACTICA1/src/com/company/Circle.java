package com.company;

public class Circle {

    //MEMBER METHODS
    //CONSTRUCTOR
    Circle(float radius){
        this.pi = (float) 3.14;
        this.radius = radius;
    }

    //GETTERS AND SETTERS
    public float getPi() {
        return pi;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    //PERIMETER CIRCLE = CALCULATE THE PERIMETER OF A CIRCLE
    public float perimeterCircle(float pi, float radius){
        return 2 * pi * radius;
    }
    //AREA CIRCLE = CALCULATES THE AREA OF A CIRCLE
    public float areaCircle(float pi, float radius){
        return pi * (radius * radius);
    }



    //DATA MEMBERS
    private final float pi;
    private float radius;







}
