package com.company;

public class C_TanqueCilindro  extends  C_Tanques {
    private float radio;
    private float altura;

    public C_TanqueCilindro(int identificacion, float capacidad,float radio, float altura) {
        super(identificacion, capacidad);
        this.radio = radio;
        this.altura = altura;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float volumen() {
        return (float) (Math.PI*Math.pow(radio,2)*altura);
    }
}
