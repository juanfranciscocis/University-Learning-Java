package com.company;

import java.util.ArrayList;

public class C_ControladoraMunicipal {
    private ArrayList<C_Tanques> c_tanquesArrayList = new ArrayList<C_Tanques>();

    public C_ControladoraMunicipal(){}


    public ArrayList<C_Tanques> getC_tanquesArrayList() {
        return c_tanquesArrayList;
    }

    public void setC_tanquesArrayList(C_Tanques c_tanques) {
        this.c_tanquesArrayList.add(c_tanques);
    }

    public void cambioEstadoValvula(int identificador){
        try{
            for (int i =0;i<c_tanquesArrayList.size();i++){
                if (c_tanquesArrayList.get(i).getIdentificacion() == identificador && c_tanquesArrayList.get(i).volumen() <= 25 ){
                    for (int j= 0; j<c_tanquesArrayList.get(i).getC_controladoraValvulas().getC_valvulasArrayList().size();j++){
                        c_tanquesArrayList.get(i).getC_controladoraValvulas().getC_valvulasArrayList().get(j).setEstado(false);
                    }
                }
            }

        }catch (IndexOutOfBoundsException e){
            new C_Excepcion(1).myExcepcion();
        }catch (NoSuchFieldError e){
            new C_Excepcion(2).myExcepcion();
        }catch (Exception e){
            new C_Excepcion(3).myExcepcion();
        }

    };




    public void estaFull(){

        for (int i =0 ; i < c_tanquesArrayList.size();i++){
            if (c_tanquesArrayList.get(i).getCapacidad() == c_tanquesArrayList.get(i).volumen() ){
                System.out.println("TANQUE NUNERO" + i + "ESTA LLENO");

            }
        }
    }


    public void emergencia(){
        for (int i = 0 ; i < c_tanquesArrayList.size();i++){
            for (int j = 0; i < c_tanquesArrayList.get(i).getC_controladoraValvulas().getC_valvulasArrayList().size();j++){
                c_tanquesArrayList.get(i).getC_controladoraValvulas().getC_valvulasArrayList().get(j).setEstado(false);
            }
        }
    }

    public float volumenAguaTotal(){
        float volumenAguaTotal =0;
        for (int i=0;i< c_tanquesArrayList.size();i++){
            volumenAguaTotal += c_tanquesArrayList.get(i).volumen();
        }
        return volumenAguaTotal;
    }







}
