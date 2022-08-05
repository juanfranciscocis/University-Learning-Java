package com.company;

public class C_Embarazada35 extends C_Embarazadas{


    public C_Embarazada35(String nombre, int hist,C_ExamenAmneosentesis examenAmneosentesis) {
        super(nombre,hist);
        examanesArrayList.add(examenAmneosentesis);
        setEnRiesgo(true);
    }






}
