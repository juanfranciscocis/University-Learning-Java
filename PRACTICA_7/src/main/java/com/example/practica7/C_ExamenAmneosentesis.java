package com.example.practica7;

public class C_ExamenAmneosentesis extends C_Examen {
    //DATA MEMBERS
    private Boolean amneosentesis;


    //FUNCTION MEMBERS


    public C_ExamenAmneosentesis(boolean amneosentesis) {
        setAmneosentesis(amneosentesis);
    }

    public Boolean getAmneosentesis() {
        return amneosentesis;
    }

    public void setAmneosentesis(Boolean amneosentesis) {
        this.amneosentesis = amneosentesis;
    }
}
