package com.example.laboratorio_4;

public class C_Excepciones extends RuntimeException{
    private String mensaje;

    public C_Excepciones(){
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void miExcepcion(int index){
        switch (index){
            case 1:
                System.out.println("NO HAY EMBARAZADAS REGISTRADAS");
                break;
            case 2:
                System.out.println("NO HAY EMBARAZADAS REGISTRADAS");
                break;


        }

    }



}
