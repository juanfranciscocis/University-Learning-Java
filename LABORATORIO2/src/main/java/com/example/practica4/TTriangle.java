package com.example.practica4;

import com.example.practica4.TPolygon;

public class TTriangle extends TPolygon {
    //DATA MEMBERS
        //NO MEMBERS

    //FUNCTION MEMBERS
    //CONSTRUCTOR
    public TTriangle(float widht, float height) {
        super(widht, height);
    }

    public TTriangle() {
        this(0,0);
    }


    //OVERRIDE AREA FUNCTION
    @Override
    public float area() {
        return super.area()/2;
    }



}
