package com.example.estudioindependiente_4;

import java.util.ArrayList;

public class C_AutomovileControler {
    private ArrayList<C_Automovile> c_automovileArrayList = new ArrayList<>();

    public C_AutomovileControler() {
    }

    public ArrayList<C_Automovile> getC_automovileArrayList() {
        return c_automovileArrayList;
    }

    public void setC_automovileArrayList(C_Automovile c_automovile) {
        this.c_automovileArrayList.add(c_automovile);
    }
}
