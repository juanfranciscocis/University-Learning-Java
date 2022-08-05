package com.company;

import java.util.ArrayList;

public class C_Embarazadas {

    protected String nombre;
    private int numeroDeHistoria;
    private boolean enRiesgo =false;
    ArrayList<C_Examenes> examanesArrayList = new ArrayList<C_Examenes>();


    public C_Embarazadas(String nombre, int numeroDeHistoria) {
        this.nombre = nombre;
        this.numeroDeHistoria = numeroDeHistoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public  int getNumeroDeHistoria() {
        return numeroDeHistoria;
    }

    public ArrayList<C_Examenes> getExamanesArrayList() {
        return examanesArrayList;
    }

    public void setExamanesArrayList(C_Examenes examenes) {
        this.examanesArrayList.add(examenes);
    }

    public boolean isEnRiesgo() {
        return enRiesgo;
    }

    public void setEnRiesgo(boolean enRiesgo) {
        this.enRiesgo = enRiesgo;
    }
}
