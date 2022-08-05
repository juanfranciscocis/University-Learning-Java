package com.example.ei3;

public class Poligono {
    protected float width;
    protected float height;

    public Poligono(float width, float height){
        this.width = width;
        this.height = height;
    }

    public Poligono(){
        this(0,0);
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float area(){
        return width * height;
    }
}
