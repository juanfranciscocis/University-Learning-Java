package com.company;

public class C_EmbarazadaTensionAlta extends C_Embarazadas implements C_EmbarazadaInterface {
    private float valoresMinimos;
    private float pulsaciones;

    public C_EmbarazadaTensionAlta(String nombre,int hist,float valoresMinimos) {
        super(nombre,hist);
        this.valoresMinimos = valoresMinimos;
        if (valoresMinimos >=90){
            setEnRiesgo(true);
        }
    }

    public float getValoresMinimos() {
        return valoresMinimos;
    }

    public void setValoresMinimos(float valoresMinimos) {
        this.valoresMinimos = valoresMinimos;
    }


    @Override
    public void setValorExtra(float valor) {
        this.pulsaciones = valor;
    }

    @Override
    public float getValorExtra() {
        return pulsaciones;
    }
}
