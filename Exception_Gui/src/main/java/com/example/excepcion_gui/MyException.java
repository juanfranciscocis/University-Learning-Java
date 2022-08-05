package com.example.excepcion_gui;

public class MyException extends RuntimeException {
    //DATA MEMBERS
    private String msg =" ";
    private int code;

    //FUNCTION MEMBERS
    //CONSTRUCTOR
    public MyException(String m){
        this.msg = m;

    }

    public MyException(int code){
        this.code = code;

    }



    @Override
    public String getMessage() {
        return msg;
    }

    public String getMsg(){
        String output ="";

        switch (code){
            case (0):
                output = "LONGITUD INDEBIDA";

            case (1):
                output = "LA PALABRA NO COMIENZA CON A";

        }
        return output;
    }


}
