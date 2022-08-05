package com.example.laboratorio_4;

public class C_EmbarazadaDiabetica extends C_Embarazadas implements C_EmbarazadaInterface {

    float glucosa =0;


    public C_EmbarazadaDiabetica(String nombre, int hist, C_ExamenesPTG examenesPTG) {
        super(nombre,hist);
        examanesArrayList.add(examenesPTG);
        setEnRiesgo(true);
    }


    @Override
    public void setValorExtra(float valor) {
        this.glucosa = valor;
    }

    @Override
    public float getValorExtra() {
        return glucosa;
    }
}
