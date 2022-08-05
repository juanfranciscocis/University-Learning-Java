package com.company;

public class C_Examenes {


    protected String nombre;
    protected boolean resultado;

    public C_Examenes(String nombre, boolean resultado) {
        this.nombre = nombre;
        this.resultado = resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }


}
