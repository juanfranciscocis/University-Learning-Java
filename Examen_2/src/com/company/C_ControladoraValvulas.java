package com.company;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;

public class C_ControladoraValvulas {
    private ArrayList<C_Valvulas> c_valvulasArrayList = new ArrayList<C_Valvulas>();

    public C_ControladoraValvulas() {
    }

    public ArrayList<C_Valvulas> getC_valvulasArrayList() {
        return c_valvulasArrayList;
    }

    public void setC_valvulasArrayList(C_Valvulas c_valvulas) {
        int counter = 0;
        for (int i=0; i < c_valvulasArrayList.size();i++){
            if (c_valvulas.getIdentificador() == c_valvulasArrayList.get(i).getIdentificador() ){
                new C_Excepcion(4).myExcepcion();
                counter++;
                break;
            }
        }

        if (counter==0){
            this.c_valvulasArrayList.add(c_valvulas);
        }

    }
}
