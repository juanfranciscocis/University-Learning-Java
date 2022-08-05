package com.example.practica4;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class GuiFx extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);


        TFigure tFigure = new TFigure();
        for (int i = 0 ; i <10 ; i++){
            TRectangle tRectangle = new TRectangle(100,100);
            tFigure.setRectanglesArr(tRectangle);
            System.out.println(tFigure.getRectanglesArr().get(i).area());

            TTriangle tTriangle = new TTriangle(100,100);
            tFigure.setTrianglesArr(tTriangle);
            System.out.println(tFigure.getTrianglesArr().get(i).area());

            System.out.println();
        }













        Scene scene = new Scene(gridPane, 500, 500);
        stage.setTitle("PRACTICA 4");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}