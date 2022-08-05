package com.example.practica2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {



        //CREO UN OBJETO DE LA CLASE TEXTFIELDARRAY
        TextFieldArray textFieldArray = new TextFieldArray(); //CREO UN OBJETO DE LA CLASE TEXTFIELD ARRAY
        textFieldArray.createTextFieldsAndStore(); //CREO EL ARRAY DE TEXTFIELDS
        textFieldArray.showTextFieldArrayFE(); //MUESTRO EN EL GRIDPANEL EL ARRAY



        //ASIGN THE GRIDPANEL IN A SCENE
        Scene scene = new Scene(textFieldArray.getGridPane(),500,500);
        //SHOW THE SCENE IN THE STAGE  (WINDOW 1)
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}

