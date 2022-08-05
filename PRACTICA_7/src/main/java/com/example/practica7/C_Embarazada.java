package com.example.practica7;

import java.util.ArrayList;

public  class C_Embarazada  {
    //DATA MEMEBERS
    private String nombre;
    private int edad;
    private static int numeroHisClinica = 0;
    private boolean estaEnRiesgo;
    private boolean diabetica;
    private int glucosa;
    private int pulsaciones;
    private ArrayList<C_Examen> examenArrayList = new ArrayList<C_Examen>();

    //FUNCTION MEMBERS
    //CONSTRUCTOR
    //NORMAL
    public C_Embarazada(String nombre, int edad, boolean diabetica, boolean examenAmneosentesis, int examennPTG,int glucosa, int pulsaciones) {
        this.nombre = nombre;
        this.edad =edad;
        this.diabetica = diabetica;


        if (edad > 35){
            estaEnRiesgo = true;
            examenArrayList.add(new C_ExamenAmneosentesis(examenAmneosentesis));
        }

        if (diabetica == true){
            estaEnRiesgo = true;
            examenArrayList.add(new C_ExamenPTG(examennPTG));
        }

        if (edad >=16 && edad <=18){
            estaEnRiesgo = true;

        }

        if (diabetica == true && examennPTG>0){
            this.glucosa = glucosa;
        }
        if (examenAmneosentesis == true && examennPTG>0){
            this.pulsaciones = pulsaciones;
        }




    }



    //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getNumeroHisClinica() {
        return numeroHisClinica;
    }

    public ArrayList<C_Examen> getExamenArrayList() {
        return examenArrayList;
    }

    public void setExamenArrayList(C_Examen examen) {
        this.examenArrayList.add(examen);
    }

    public void estaEnRiesgo(){
        if (edad > 35){
            this.estaEnRiesgo = true;
        }

    }
}
