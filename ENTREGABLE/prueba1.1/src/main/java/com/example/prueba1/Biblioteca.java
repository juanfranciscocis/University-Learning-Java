package com.example.prueba1;

import java.util.ArrayList;

public class Biblioteca {


    //DATOS MIEMBRO
    String nombreStud;
    String solicitudTitulo;
    String solicitudAutor;
    int numSolicitud;

        //ARRAYLIST
    ArrayList<String> solicitudRechazada = new ArrayList<>();
    ArrayList<Libros> librosArr  =  new ArrayList<>(0);
    ArrayList<String> solicitudNueva = new ArrayList<>();

    //FUNCIONES MIEMBRO

    //CONSTRUCTOR
    Biblioteca(){

    }
    //GETTERS Y SETTERS


    public String getNombreStud() {
        return nombreStud;
    }

    public void setNombreStud(String nombreStud) {
        this.nombreStud = nombreStud;
    }

    public String getSolicitudTitulo() {
        return solicitudTitulo;
    }

    public void setSolicitudTitulo(String solicitudTitulo) {
        this.solicitudTitulo = solicitudTitulo;
    }

    public String getSolicitudAutor() {
        return solicitudAutor;
    }

    public void setSolicitudAutor(String solicitudAutor) {
        this.solicitudAutor = solicitudAutor;
    }

    public ArrayList<String> getSolicitudRechazada() {
        return solicitudRechazada;
    }

    public void setSolicitudRechazada(ArrayList<String> solicitudRechazada) {
        this.solicitudRechazada = solicitudRechazada;
    }

    public ArrayList<Libros> getLibrosArr() {
        return librosArr;
    }

    public void setLibrosArr(Libros libros) {
        this.librosArr.add(libros);
    }

    public int getNumSolicitud() {
        return numSolicitud;
    }

    public void setNumSolicitud(int numSolicitud) {
        this.numSolicitud = numSolicitud;
    }

    public ArrayList<String> getSolicitudNueva() {
        return solicitudNueva;
    }

    //FUNCIONES
    public boolean puedoProcesar(String solicitudTitulo, String solicitudAutor){
        if (cantidadEjemplares(solicitudTitulo,solicitudAutor)!=0){
            System.out.println("SI SE PUEDE PROCESAR LA SOLICITUD");
            procesarSolicitud(getNombreStud(),getSolicitudTitulo(),getSolicitudAutor(),getNumSolicitud());
            System.out.println("LA SOLICITUD HA SIDO GUARDADA CON EXITO");
            System.out.println();
            return true;
        }else {
            System.out.println("NO SE PUDO PROCESAR LA SOLICITUD, DEBIDO A QUE NO HAY EJEMPLARES PARA EL LIBRO");
            String solicitudRechazada = getNombreStud() + " " + getSolicitudTitulo()+ " " + getSolicitudAutor() + " " + getNumSolicitud();
            getSolicitudRechazada().add(solicitudRechazada);
            consoleRechazadas();
            return false;
        }


    }

     public void procesarSolicitud(String nombreStud,String solicitudTitulo ,String solicitudAutor,int numSolicitud){
        String solicitudNueva = nombreStud + " " + solicitudTitulo+ " " + solicitudAutor + "" + numSolicitud;
        getSolicitudNueva().add(solicitudNueva);
     }

     public void consoleRechazadas(){
        System.out.println("SOLICITUDES RECHAZADAS: ");

        for (int i = 0 ;  i <  getSolicitudRechazada().size();i++){
            System.out.println(getSolicitudRechazada().get(i));
        }

     }

     public int cantidadEjemplares(String titulo ,String autor){
        int cantidadEjem = 0;
        for (int i = 0; i < getLibrosArr().size();i++){
            if (getLibrosArr().get(i).getAutor().equals(autor) && getLibrosArr().get(i).getTitulo().equals(titulo)){
                cantidadEjem = getLibrosArr().get(i).getCantidadEnExistencia();
            }

        }

        return cantidadEjem;
     }

     public void printSolicitud(){
        System.out.println("NOMBRE ESTUD: " + getNombreStud());
        System.out.println("TITULO: " + getSolicitudTitulo());
        System.out.println("NOMBRE AUTOR: " + getSolicitudAutor());
        System.out.println("NUMERO DE SOLICITUD: " + getNumSolicitud());

     }



}
