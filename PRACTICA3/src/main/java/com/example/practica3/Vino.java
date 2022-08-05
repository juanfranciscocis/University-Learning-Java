package com.example.practica3;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.xml.parsers.SAXParser;
import java.util.ArrayList;

public class Vino {

    //DATOS MIEMBRO
    private String name  = "";
    private String cosecha = "";
    private String type = "";
    private String disponibiity = "";
    private double sell10 = 0.0;
    private ArrayList fiveYearsArr = new ArrayList<>(3);
    private Suministrator suministrator = new Suministrator();
    private boolean hacerPedido = false;

    //GUI
    private TextField ventaNuevaTXT = new TextField("");
    private TextField firstFiveTXT = new TextField("INTRODUCIR VENTA PRIMEROS 5 ANOS");
    private TextField secondFiveTXT = new TextField("INTRODUCIR VENTA SEGUNDOS 5 ANOS");
    private TextField tiempoEntregaTXT = new TextField("INTRODUCIR TIEMPO DE ENTREGA");

    //FUNCIONES MIEMBRO
    public void ventaNueva(){
        ventaNuevaTXT.setText("HACER PEDIDO");
    }

    public void promedio(){
        //IMPRIMIR ARRAY EN PANTALLA
        for (int i = 0; i < fiveYearsArr.size() ; i++){
            System.out.println( "DATA 5 ANOS: " + fiveYearsArr.get(i));
        }

        if ((int)fiveYearsArr.get(0) < (int)fiveYearsArr.get(1) && suministrator.getTime() <= 30){
            hacerPedido = true;
        }


        if (hacerPedido == true){
            ventaNueva();
        }else {
            ventaNuevaTXT.setText("NO HACER PEDIDO");
        }



    }



    public int getFirstFiveUSR() {
        fiveYearsArr.add(0,Integer.parseInt(firstFiveTXT.getText()));
        return Integer.parseInt(firstFiveTXT.getText());
    }

    public int getSecondFiveUSR() {
        fiveYearsArr.add(1,Integer.parseInt(secondFiveTXT.getText()));
        return Integer.parseInt(secondFiveTXT.getText());
    }

    public int getTiempoEntregaUSR() {
        suministrator.setTime(Integer.parseInt(tiempoEntregaTXT.getText()));
        return Integer.parseInt(tiempoEntregaTXT.getText()) ;
    }

    public TextField getVentaNuevaTXT() {
        return ventaNuevaTXT;
    }

    public TextField getFirstFiveTXT() {
        return firstFiveTXT;
    }

    public TextField getSecondFiveTXT() {
        return secondFiveTXT;
    }

    public TextField getTiempoEntregaTXT() {
        return tiempoEntregaTXT;
    }

    public ArrayList getFiveYearsArr() {
        return fiveYearsArr;
    }

    public class Suministrator{
        //DATOS MIEMBRO
        private String nameSum = "";
        private String country = "";
        private int time = 0;

        public String getNameSum() {
            return nameSum;
        }

        public void setNameSum(String nameSum) {
            this.nameSum = nameSum;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }


    }








}
