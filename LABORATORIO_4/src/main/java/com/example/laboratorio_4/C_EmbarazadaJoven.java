package com.example.laboratorio_4;

public class C_EmbarazadaJoven extends C_Embarazadas{
    private int edad;


    public C_EmbarazadaJoven(String nombre,int hist, int edad) {
        super(nombre,hist);
        this.edad = edad;
        if (edad >=16 && edad <=18){
            setEnRiesgo(true);
        }
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
