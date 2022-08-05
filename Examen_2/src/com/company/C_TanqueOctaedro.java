package com.company;

public class C_TanqueOctaedro extends C_Tanques{
    private float ladoA;
    private float ladoB;
    private float altura;

    public C_TanqueOctaedro(int identificacion,float capacidad,float ladoA, float ladoB, float altura) {
        super(identificacion,capacidad);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.altura = altura;
    }

    public float getLadoA() {
        return ladoA;
    }

    public void setLadoA(float ladoA) {
        this.ladoA = ladoA;
    }

    public float getLadoB() {
        return ladoB;
    }

    public void setLadoB(float ladoB) {
        this.ladoB = ladoB;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float volumen() {
        return ladoA*ladoB*altura;
    }
}
