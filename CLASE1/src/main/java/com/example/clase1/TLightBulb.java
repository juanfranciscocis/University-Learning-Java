package com.example.clase1;

public class TLightBulb {
    //FUNCIONES MIMEBRO
    //CONSTRUCTOR
    public TLightBulb(boolean state, float consume){
        this.consume = consume;
        this.state = state;
    }

    public TLightBulb(){
        this(false,0);
    }

    //GETTERS AND SETTERS
    public boolean getState(){
        return state;
    }

    public float getConsume(){
        return consume;
    }

    public void setState(boolean state){
        this.state = state;
    }

    public void setConsume(float consume){
        this.consume = consume;
    }


    //DATOS MIEMBRO
    private boolean state;
    private float consume;






}
