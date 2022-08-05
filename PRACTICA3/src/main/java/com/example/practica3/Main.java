package com.example.practica3;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //CONTENEDOR
        GridPane gridPane = new GridPane(); //clase GridPane objeto gridpane
        gridPane.setAlignment(Pos.CENTER);

        //ESPACIAMIENTO ENTRE NODOS
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        //CREACION Y DECLARACION DE LA CLASE VINO
        Vino vino = new Vino();

        vino.getFirstFiveTXT().setPrefWidth(250);
        gridPane.add(vino.getFirstFiveTXT(),0,0);

        vino.getSecondFiveTXT().setPrefWidth(250);
        gridPane.add(vino.getSecondFiveTXT(),2,0);

        vino.getTiempoEntregaTXT().setPrefWidth(250);
        gridPane.add(vino.getTiempoEntregaTXT(),1,1);

        vino.getVentaNuevaTXT().setPrefWidth(250);
        vino.getVentaNuevaTXT().setEditable(false);
        gridPane.add(vino.getVentaNuevaTXT(),1,2);


        //EVENTOS

        vino.getFirstFiveTXT().setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                //WHEN PRESSING ENTER
               if (keyEvent.getCode().equals(KeyCode.ENTER)){
                   vino.getFirstFiveUSR();
                   System.out.println("ARRAY PRIMERA CASILLA: " + vino.getFiveYearsArr().get(0));
               }

            }
        });

        vino.getSecondFiveTXT().setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                //WHEN PRESSING ENTER
                if (keyEvent.getCode().equals(KeyCode.ENTER)){
                    vino.getSecondFiveUSR();
                    System.out.println("ARRAY SEGUNDA CASILLA: " + vino.getFiveYearsArr().get(1));
                }
            }
        });

        vino.getTiempoEntregaTXT().setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                //WHEN PRESSING ENTER
                if (keyEvent.getCode().equals(KeyCode.ENTER)){
                    vino.getTiempoEntregaUSR();
                    System.out.println("ARRAY SEGUNDA CASILLA: " + vino.getTiempoEntregaUSR());
                    vino.promedio();
                }
            }
        });






        //CREAR EL VISUALIZADOR (SCENE)
        Scene scene = new Scene(gridPane,500,500); //CONTENEDOR, TAMANO DE LA VENTANA X,Y

        //VENTANA (STAGE)
        Stage stage1 = new Stage(); //DECLARACION Y CREACION DE LA VENTANA
        stage1.setScene(scene); //SETEO DEL SCENE
        stage1.show(); //MOSTRAMOS AL USUARIO EL GUI


    }





    public static void main(String[] args) {
        launch();
    }
}


