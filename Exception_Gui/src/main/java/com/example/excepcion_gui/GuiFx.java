package com.example.excepcion_gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class GuiFx extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(gridPane,500,500);


        Button button = new Button("1/0");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                verificar("Sebas",10);
            }
        });
        gridPane.add(button,0,0);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    private char verificar(String str, int i) {

        char output =' ';
        try{

            if (str.length()<i){
                throw new MyException(0);
            }else {
                output = str.charAt(i);
                System.out.println(output);
            }

            if (str.charAt(0) != 'A'){
                throw new MyException(1);
            }


        }catch (MyException e) {
            System.out.println(e.getMsg());
        }
        return output;
    }

    public static void main(String[] args) {
        launch();
    }
}