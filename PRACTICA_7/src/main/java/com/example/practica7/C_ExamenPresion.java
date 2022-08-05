package com.example.practica7;

public class C_ExamenPresion extends C_Examen {
    private int min;
    private int max;
    public C_ExamenPresion(int max, int min) {
        this.max = max;
        this.min = min;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
