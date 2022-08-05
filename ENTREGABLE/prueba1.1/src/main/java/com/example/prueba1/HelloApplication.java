package com.example.prueba1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //CREACION DE LIBROS
        Libros libros1 = new Libros("vuelta al mundo en 80 dias", "verne",10,10);
        Libros libros2 = new Libros("harry potter","j. k. rowling",20,20);

        Biblioteca bibliotecaUSFQ  = new Biblioteca();
        bibliotecaUSFQ.setLibrosArr(libros1);
        bibliotecaUSFQ.setLibrosArr(libros2);
        System.out.println("LIBROS INDEXADOS: ");

        for (int i = 0 ; i < bibliotecaUSFQ.getLibrosArr().size();i++){
            System.out.println(bibliotecaUSFQ.getLibrosArr().get(i).getAutor() + " " + bibliotecaUSFQ.getLibrosArr().get(i).getTitulo() );

        }

        System.out.println();
        System.out.println("PRESIONE 0 PARA CANCELAR, CUALQUIER NUMERO PARA CONTINUAR");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int continuar = Integer.valueOf(input.readLine());

        while (continuar!=0){
            System.out.println();
            System.out.println("-----NUEVA SOLICITUD----");
            System.out.println("INGRESE EL NOMBRE DEL ESTUDIANTE: ");
            bibliotecaUSFQ.setNombreStud(input.readLine().toUpperCase());

            System.out.println("INGRESE EL TITULO DEL LIBRO: ");
            bibliotecaUSFQ.setSolicitudTitulo(input.readLine().toUpperCase());

            System.out.println("INGRESE EL NOMBRE DEL AUTOR DEL LIBRO: ");
            bibliotecaUSFQ.setSolicitudAutor(input.readLine().toUpperCase());

            System.out.println("INGRESE EL NUMERO DE SOLICITUD: ");
            bibliotecaUSFQ.setNumSolicitud(Integer.valueOf(input.readLine()));

            bibliotecaUSFQ.printSolicitud();
            System.out.println();

            bibliotecaUSFQ.puedoProcesar(bibliotecaUSFQ.getSolicitudTitulo(), bibliotecaUSFQ.getSolicitudAutor());


            System.out.println("PRESIONE 0 PARA CANCELAR, CUALQUIER NUMERO PARA CONTINUAR");
            continuar = Integer.valueOf(input.readLine());

        }










    }

    public static void main(String[] args) {
        launch();
    }
}