package com.example.ei3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class GuiFx extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        Scene scene = new Scene(gridPane, 600, 250);

        //GUI
        gridPane.add(new Label("INGRESE LOS DATOS PARA EL TRIANGULO"),0,0);

        //WIDTH TXT
        TextField widthTxt = new TextField("WIDTH");
        widthTxt.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                widthTxt.setText("");
            }
        });
        gridPane.add(widthTxt,0,1);

        //LENGTH
        TextField lengthTxt = new TextField("LENGTH");
        lengthTxt.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                lengthTxt.setText("");
            }
        });
        gridPane.add(lengthTxt,1,1);

        //HYPOTENUSE
        TextField hypotenuseTxt = new TextField("HYPOTENUSE");
        hypotenuseTxt.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                hypotenuseTxt.setText("");
            }
        });
        gridPane.add(hypotenuseTxt,2,1);

        //RESIZE
        TextField resizeTxt = new TextField("RESIZE");
        resizeTxt.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                resizeTxt.setText("");
            }
        });
        gridPane.add(resizeTxt,3,1);

        //ADD DATA
        Button addData = new Button("SAVE DATA");
        addData.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                try {
                    if ( Float.parseFloat(widthTxt.getText()) == 0 ||Float.parseFloat(lengthTxt.getText()) == 0 ||Float.parseFloat(hypotenuseTxt.getText()) == 0 ) {
                        MyException myException = new MyException(0);
                        Alert alert = new Alert(Alert.AlertType.ERROR, myException.errorMessage());
                        alert.show();

                    }else if (Float.parseFloat(widthTxt.getText()) < 0 || Float.parseFloat(lengthTxt.getText()) < 0 ||Float.parseFloat(hypotenuseTxt.getText())<0) {
                        MyException myException = new MyException(1);
                        Alert alert = new Alert(Alert.AlertType.ERROR, myException.errorMessage());
                        alert.show();

                    }else if (Float.parseFloat(widthTxt.getText())+Float.parseFloat(lengthTxt.getText()) <= Float.parseFloat(hypotenuseTxt.getText()) || Float.parseFloat(lengthTxt.getText())+Float.parseFloat(hypotenuseTxt.getText())<=Float.parseFloat(widthTxt.getText())|| Float.parseFloat(hypotenuseTxt.getText())+Float.parseFloat(widthTxt.getText())<= Float.parseFloat(lengthTxt.getText())){
                        MyException myException = new MyException(2);
                        Alert alert = new Alert(Alert.AlertType.ERROR,myException.errorMessage());
                        alert.show();
                    }else {
                        try {
                            Triangulo triangulo = new Triangulo(Float.parseFloat(widthTxt.getText()),
                                    Float.parseFloat(lengthTxt.getText()),
                                    Float.parseFloat(hypotenuseTxt.getText()),Integer.parseInt(resizeTxt.getText()));
                            System.out.println(triangulo.area());

                        }catch (NumberFormatException e) {
                            MyException myException = new MyException(5);
                            Alert alert = new Alert(Alert.AlertType.ERROR, myException.errorMessage());
                            alert.show();
                        }




                    }

                }catch (NumberFormatException e ){
                    MyException myException = new MyException(5);
                    Alert alert = new Alert(Alert.AlertType.ERROR, myException.errorMessage());
                    alert.show();
                }












            }
        });
        gridPane.add(addData,0,3);













        stage.setTitle("ESTUDIO INDEPENDIENTE 3");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}