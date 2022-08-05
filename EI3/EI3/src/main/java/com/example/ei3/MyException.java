package com.example.ei3;

public class MyException extends RuntimeException{
    //DATA MEMBERS
    private String msg;
    private int code;

    //FUNCTION MEMBERS
    //CONSTRUCTOR
    public MyException(int code){
        this.code = code;
    }

    //GETTERS AND SETTERS
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    //GET MESSAGE OVERRIDE
    public String errorMessage(){
        String output = "";
        switch (code){
            case 0:
                output = "TODOS LOS LADOS INGRESADOS DEBEN SER MAYOR QUE 0";
                break;
            case 1:
                output = "TODOS LOS LADOS INGRESADOS DEBEN SER MAYORES QUE 0";
                break;
            case 2:
                output = "VIOLACION DE LA DESIGUALDAD TRIANGULAR";
                break;
            case 3:
                output = "NO SE PUEDE HACER RESIZE POR 0";
                break;
            case 4:
                output = "NO SE PUEDE HACER RESIZE DEBIDO A QUE SE OBTIENEN VALORES MENORES A 0";
                break;
            case 5:
                output = "FALTAN DATOS PARA CALCULAR EL TRIANGULO";
                break;
            default:
                output = "ERROR DESCONOCIDO";
                break;

        }
        return output;
    }
}
