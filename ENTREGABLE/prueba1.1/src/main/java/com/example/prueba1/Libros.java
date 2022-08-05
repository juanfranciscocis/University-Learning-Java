package com.example.prueba1;

import java.util.Locale;

public class Libros {
    //DATOS MIEMBRO
    private String titulo;
    private String autor;
    private int cantidadTotalDeEjemplares;
    private int cantidadEnExistencia;


    //FUNCIOONES MIMEBRO

    //CONSTRUCTOR

    public Libros(String titulo, String autor, int cantidadTotalDeEjemplares, int cantidadEnExistencia) {
        this.titulo = titulo.toUpperCase();
        this.autor = autor.toUpperCase();
        this.cantidadTotalDeEjemplares = cantidadTotalDeEjemplares;
        this.cantidadEnExistencia = cantidadEnExistencia;
    }

    //GETTERS Y SETTERS


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidadTotalDeEjemplares() {
        return cantidadTotalDeEjemplares;
    }

    public void setCantidadTotalDeEjemplares(int cantidadTotalDeEjemplares) {
        this.cantidadTotalDeEjemplares = cantidadTotalDeEjemplares;
    }

    public int getCantidadEnExistencia() {
        return cantidadEnExistencia;
    }

    public void setCantidadEnExistencia(int cantidadEnExistencia) {
        this.cantidadEnExistencia = cantidadEnExistencia;
    }
}
