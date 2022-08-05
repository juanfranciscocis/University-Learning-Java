package com.example.practica_5;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class C_GuiFx extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(15);
        gridPane.setHgap(15);

        Scene scene = new Scene(gridPane, 1000, 1000);


        C_ControlAnimals c_controlAnimals = new C_ControlAnimals();


        gridPane.add(new Label("INPUT HEIGHT OF THE ANIMAL"),0,0);
        TextField height = new TextField("INPUT HEIGHT");
        height.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                height.setText("");
            }
        });
        gridPane.add(height,0,1);
        gridPane.add(new Label("INPUT WIDTH OF THE ANIMAL"),0,2);
        TextField width = new TextField("INPUT WIDTH");
        width.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                width.setText("");
            }
        });
        gridPane.add(width,0,3);
        gridPane.add(new Label("IS THE ANIMAL RUNNING?"),0,4);
        TextField isRunning = new TextField("TRUE OR FLASE");
        isRunning.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                isRunning.setText("");
            }
        });
        gridPane.add(isRunning,0,5);

        //LABEL INSIDE BUTTONS
        Label description = new Label("");
        TextField descriptionTXT = new TextField();
        final boolean[] pressButton = {false};

        //ADD DOG
        Button addDogBtt = new Button("ADD A NEW DOG");
        addDogBtt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                if (pressButton[0] != true){
                    gridPane.add(description,0,7);
                    gridPane.add(descriptionTXT,0,8);
                }
                pressButton[0] = true;
                description.setText("INPUT THE NUMBER OF FANGS THE DOG HAS");

                descriptionTXT.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        descriptionTXT.setText("");
                    }
                });
                Button okDog = new Button("ADD");
                okDog.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        c_controlAnimals.setC_animals(new C_Dog(Float.valueOf(height.getText()),Float.valueOf(width.getText()),Boolean.valueOf(isRunning.getText()),Float.valueOf(descriptionTXT.getText())));
                        //c_controlAnimals.countAnimals();
                    }
                });
                gridPane.add(okDog,0,9);
            }
        });
        gridPane.add(addDogBtt,0,6);

        //ADD CAT
        Button addCat = new Button("ADD A NEW CAT");
        addCat.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                description.setText("INPUT THE NUMBER OF RETRACTABLE NAILS THE CAT HAS");
                if (pressButton[0] != true){
                    gridPane.add(description,0,7);
                    gridPane.add(descriptionTXT,0,8);
                }
                pressButton[0] = true;
                descriptionTXT.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        descriptionTXT.setText("");
                    }
                });
                Button okCat = new Button("ADD");
                okCat.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        c_controlAnimals.setC_animals(new C_Cat(Float.valueOf(height.getText()),Float.valueOf(width.getText()),Boolean.valueOf(isRunning.getText()),Float.valueOf(descriptionTXT.getText())));
                       // c_controlAnimals.countAnimals();
                    }
                });
                gridPane.add(okCat,0,9);
            }
        });
        gridPane.add(addCat,1,6);

        //ADD OWL
        Button addOwl = new Button("ADD A NEW OWL");
        addOwl.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                description.setText("HOW HIGH IS THE OWL FLYING");
                if (pressButton[0] != true){
                    gridPane.add(description,0,7);
                    gridPane.add(descriptionTXT,0,8);
                }
                pressButton[0] = true;

                descriptionTXT.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        descriptionTXT.setText("");
                    }
                });
                Button okOwl = new Button("ADD");
                okOwl.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        c_controlAnimals.setC_animals(new C_Owl(Float.valueOf(height.getText()),Float.valueOf(width.getText()),Boolean.valueOf(isRunning.getText()),Float.valueOf(descriptionTXT.getText())));
                        //c_controlAnimals.countAnimals();
                    }
                });
                gridPane.add(okOwl,0,9);
            }
        });
        gridPane.add(addOwl,2,6);


        //SHOW ANIMAL DATA
        gridPane.add(new Label("SHOW ANIMAL COUNT"),0,10);
        Button animalCountBtt = new Button("COUNT");
        TextField dogCountText = new TextField("0");
        gridPane.add(dogCountText,0,11);
        dogCountText.setEditable(false);
        TextField catCountText = new TextField("0");
        gridPane.add(catCountText,1,11);
        catCountText.setEditable(false);
        TextField owlCountText = new TextField("0");
        gridPane.add(owlCountText,2,11);
        owlCountText.setEditable(false);
        animalCountBtt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                c_controlAnimals.countAnimals();
                dogCountText.setText(String.valueOf(c_controlAnimals.getCountDog()));
                catCountText.setText(String.valueOf(c_controlAnimals.getCountCat()));
                owlCountText.setText(String.valueOf(c_controlAnimals.getCountOwl()));
                c_controlAnimals.setCountDog(0);
                c_controlAnimals.setCountCat(0);
                c_controlAnimals.setCountOwl(0);
            }
        });
        gridPane.add(animalCountBtt,3,11);


        /////
        gridPane.add(new Label("RUNNING AND FLYING ANIMALS"),0,12);
        ListView<String> showInfoListView = new ListView<String>();
        ObservableList<String> infoToShow = FXCollections.observableArrayList();

        c_controlAnimals.runningFlight();














        stage.setTitle("PRACTICA_5: ANIMAL!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}