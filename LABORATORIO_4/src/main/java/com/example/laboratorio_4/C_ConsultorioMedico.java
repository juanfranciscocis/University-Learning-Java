package com.example.laboratorio_4;

import java.util.ArrayList;

public class C_ConsultorioMedico {

    //DATA MEMBERS
    private ArrayList<C_Embarazadas> embarazadasArrayList = new ArrayList<C_Embarazadas>();


    //FUNCTION MEMBERS
    public C_ConsultorioMedico() {
    }

    public ArrayList<C_Embarazadas> getEmbarazadasArrayList() {
        return embarazadasArrayList;
    }

    public void setEmbarazadasArrayList(C_Embarazadas embarazadas) {
        this.embarazadasArrayList.add(embarazadas);
    }


    public int embarazadasEnRiesgo(){
        int riesgo =0;
        for (int i =0;i<embarazadasArrayList.size();i++){
            if (embarazadasArrayList.get(i).isEnRiesgo()){
                riesgo++;
            }else {
                for (int j=0; i<embarazadasArrayList.get(i).getExamanesArrayList().size();i++){
                    if (embarazadasArrayList.get(i).examanesArrayList.get(j) instanceof C_ExamenAmneosentesis && embarazadasArrayList.get(i).examanesArrayList.get(j).getResultado() == true ){
                        riesgo++;
                    }

                    if (embarazadasArrayList.get(i).examanesArrayList.get(j) instanceof C_ExamenesPTG){
                        if (((C_ExamenesPTG) embarazadasArrayList.get(i).examanesArrayList.get(j)).getPtgResult()>=4.4){
                            riesgo++;
                        }
                    }
                }
            }
        }
        return riesgo;
    }

    public int cantidadEmbarazadasDiabeticas(){
        int cantidadDiabeticas=0;

        for (int i =0;i<embarazadasArrayList.size();i++ ){
            if (embarazadasArrayList.get(i) instanceof C_EmbarazadaDiabetica){
                cantidadDiabeticas++;
            }
        }
        return cantidadDiabeticas;

    }

    public int cantidadEmbarazadas35Riesgo(){
        int cantidadEmbarazada=0;

        for (int i =0;i<embarazadasArrayList.size();i++ ){
            if (embarazadasArrayList.get(i) instanceof C_Embarazada35){
                cantidadEmbarazada++;
            }
        }
        return cantidadEmbarazada;

    }

    public float tensionMinimaAlcanzada(String nombre){
        float tensionMinima = 0;
        for (int i=0; i<embarazadasArrayList.size();i++){
            if (embarazadasArrayList.get(i).getNombre() == nombre && embarazadasArrayList.get(i) instanceof C_EmbarazadaTensionAlta ){
                tensionMinima = ((C_EmbarazadaTensionAlta) embarazadasArrayList.get(i)).getValoresMinimos();
            }
        }
        return tensionMinima;
    }

    public int embarazadaDiabeticaMayorPTG(){
        float mayorPTG = 0;
        int histClinica=0;

        for (int i =0 ; i<embarazadasArrayList.size();i++){
            if (embarazadasArrayList.get(i)instanceof C_EmbarazadaDiabetica){
               for (int j=0;i < embarazadasArrayList.get(i).examanesArrayList.size();i++){
                   if (embarazadasArrayList.get(i).examanesArrayList.get(j) instanceof C_ExamenesPTG){
                       if (((C_ExamenesPTG) embarazadasArrayList.get(i).examanesArrayList.get(j)).getPtgResult() >= mayorPTG){
                           histClinica = embarazadasArrayList.get(i).getNumeroDeHistoria();
                       }

                   }
               }
            }
        }



        return histClinica;
    }

    public void imprimirValorChequeoExtra(){
        for (int i=0; i< embarazadasArrayList.size();i++){
            if (embarazadasArrayList.get(i) instanceof C_EmbarazadaDiabetica || embarazadasArrayList.get(i) instanceof C_EmbarazadaTensionAlta){
                System.out.println("VALOR EXTRA: " + ((C_EmbarazadaInterface) embarazadasArrayList.get(i)).getValorExtra());
            }
        }
    }


















}
