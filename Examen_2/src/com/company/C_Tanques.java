package com.company;

import java.util.ArrayList;

public abstract class C_Tanques {
    private int identificacion;
    private float capacidad;
    private C_ControladoraValvulas c_controladoraValvulas = new C_ControladoraValvulas();

    public C_Tanques(int identificacion, float capacidad) {
        this.identificacion = identificacion;
        this.capacidad = capacidad;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public C_ControladoraValvulas getC_controladoraValvulas() {
        return c_controladoraValvulas;
    }

    public void setC_controladoraValvulas(C_ControladoraValvulas c_controladoraValvulas) {
        this.c_controladoraValvulas = c_controladoraValvulas;
    }

    public abstract float volumen();

}
