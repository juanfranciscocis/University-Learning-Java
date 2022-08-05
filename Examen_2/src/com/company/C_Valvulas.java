package com.company;

public class C_Valvulas {

    private int identificador;
    private String municipio;
    private boolean estado;

    public C_Valvulas(int identificador, String municipio, boolean estado) {
        this.identificador = identificador;
        this.municipio = municipio;
        this.estado = estado;
    }

    public int getIdentificador() {
        return identificador;
    }


    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
