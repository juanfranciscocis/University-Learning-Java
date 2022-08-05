package com.example.practica4;

import java.util.ArrayList;

public class TFigure {

    //DATA MEMBERS
    private ArrayList<TRectangle> rectanglesArr = new ArrayList<>(1);
    private ArrayList<TTriangle> trianglesArr = new ArrayList<>(1);

    //FUNCTION MEMBERS
    //CONSTRUCTOR

    public TFigure(ArrayList<TRectangle> rectanglesArr, ArrayList<TTriangle> trianglesArr) {
        this.rectanglesArr = rectanglesArr;
        this.trianglesArr = trianglesArr;
    }

    public TFigure(){
    }

    //GETTERS AND SETTERS
    public ArrayList<TRectangle> getRectanglesArr() {
        return rectanglesArr;
    }

    public void setRectanglesArr(TRectangle tRectangle) {
        this.rectanglesArr.add(tRectangle);
    }

    public ArrayList<TTriangle> getTrianglesArr() {
        return trianglesArr;
    }

    public void setTrianglesArr(TTriangle tTriangle) {
        this.trianglesArr.add(tTriangle);
    }


}
