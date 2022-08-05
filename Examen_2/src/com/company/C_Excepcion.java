package com.company;

public class C_Excepcion {
    private String msg;
    private int code;

    public C_Excepcion(int code) {
        this.code = code;
    }

    public void myExcepcion(){
        switch (code){
            case 1:
                msg = "NO HAY TANQUES EN LA CONTROLADORA DE MUNICIPIOS";
                break;
            case 2:
                msg = "NO SE ENCUENTRA EL TANQUE";
                break;
            case 3:
                msg = "NINGUNA VALVULA PUEDE SER CERRADA";
                break;
            case 4:
                msg= "ESTE MUNICIPIO YA EXISTE";


        }
    }


}
