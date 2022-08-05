package com.example.laboratorio_4;

public class C_ExamenesPTG extends C_Examenes{

    private float ptgResult;



    public C_ExamenesPTG(String nombre, boolean resultado, float ptgResult) {
        super(nombre, true);
        this.ptgResult = ptgResult;
    }


    public float getPtgResult() {
        return ptgResult;
    }

    public void setPtgResult(float ptgResult) {
        this.ptgResult = ptgResult;
    }
}
