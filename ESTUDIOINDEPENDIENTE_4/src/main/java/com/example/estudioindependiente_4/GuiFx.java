package com.example.estudioindependiente_4;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventListener;
import java.util.Locale;

public class GuiFx extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        C_AutomovileControler c_automovileControler = new C_AutomovileControler();


        GridPane mainGridPane = new GridPane();
        mainGridPane.setHgap(15);
        mainGridPane.setVgap(15);
        mainGridPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(mainGridPane, 500, 500);


        Button newAutoBtt = new Button("NEW AUTOMOVILE");
        newAutoBtt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                GridPane autoGridPane = new GridPane();
                autoGridPane.setAlignment(Pos.CENTER);
                autoGridPane.setVgap(15);
                autoGridPane.setHgap(15);
               Scene autoScene = new Scene(autoGridPane,1000,1000);
               stage.setScene(autoScene);

                autoGridPane.add(new Label("CHOOSE AN AUTOMOVILE TYPE"),0,0);
                ObservableList<String> typeCarList = FXCollections.observableArrayList("CAR","TRUCK");
                ComboBox chooseCarType = new ComboBox<>(typeCarList);
                autoGridPane.add(chooseCarType,0,1);


                autoGridPane.add(new Label("INPUT BRAND"),0,2);
                TextField brandTxt = new TextField();
                autoGridPane.add(brandTxt,0,3);

                autoGridPane.add(new Label("INPUT COLOR"),0,4);
                ObservableList<String> colorArr = FXCollections.observableArrayList("GREEN", "RED", "YELLOW","BLUE", "BLACK", "WHITE");
                ComboBox colorCombo  = new ComboBox<>(colorArr);
                autoGridPane.add(colorCombo,0,5);

                autoGridPane.add(new Label("INPUT PRICE"),0,6);
                TextField priceTxT = new TextField();
                autoGridPane.add(priceTxT,0,7);

                autoGridPane.add(new Label("INPUT SIZE"),0,8);
                ObservableList<String> sizeArr = FXCollections.observableArrayList("SMALL", "MEDIUM", "BIG");
                ComboBox sizeComboBox = new ComboBox<>(sizeArr);
                autoGridPane.add(sizeComboBox,0,9);


                autoGridPane.add(new Label("INPUT NUMBER OF WHEELS"),0,10);
                TextField numbWheelsTxt = new TextField();
                autoGridPane.add(numbWheelsTxt,0,11);

                autoGridPane.add(new Label("HAS A TRAILER? (THIS INPUT WILL ONLY COUNT FOR TRUCKS)"),0,12);
                ToggleGroup hasNotTrailer = new ToggleGroup();
                RadioButton hasTrailer = new RadioButton("YES");
                hasTrailer.setToggleGroup(hasNotTrailer);
                RadioButton noTrailer = new RadioButton("NO");
                noTrailer.setToggleGroup(hasNotTrailer);
                autoGridPane.add(hasTrailer,0,13);
                autoGridPane.add(noTrailer,1,13);

                autoGridPane.add(new Label("ACCEPT TERMS AND CONDITIONS TO CONTINUE"),0,14);
                CheckBox termsAndConditions = new CheckBox("TERMS AND CONDITIONS");
                autoGridPane.add(termsAndConditions,0,15);




                Button addAuto = new Button("ADD AUTOMOVILE TO INDEX");
                addAuto.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {


                        if (chooseCarType.getValue() == "CAR"){
                            try {
                                if (termsAndConditions.isSelected() == true){
                                    C_Car c_car = new C_Car(brandTxt.getText().toUpperCase(),String.valueOf(colorCombo.getValue()),Float.valueOf(priceTxT.getText()),termsAndConditions.isSelected(),String.valueOf(sizeComboBox.getValue()),Integer.valueOf(numbWheelsTxt.getText()));
                                    c_automovileControler.setC_automovileArrayList(c_car);
                                    Alert alert = new Alert(Alert.AlertType.INFORMATION,"CAR CREATED SUCCESFULLY");
                                    alert.show();
                                }  else {
                                    Alert alert = new Alert(Alert.AlertType.ERROR,"PLEASE ACCEPT TERMS AND CONDITIONS TO CONTINUE");
                                    alert.show();

                                }


                            }catch (Exception e){
                                Alert alert = new Alert(Alert.AlertType.ERROR,"ERROR ON CREATING A CAR");
                                alert.show();
                            }


                        }else if(chooseCarType.getValue() == "TRUCK"){
                            try {
                                boolean hasTrailer = false;
                                RadioButton rad = (RadioButton) hasNotTrailer.getSelectedToggle();
                                System.out.println(rad.getText());
                                if (rad.getText() == "YES"){
                                    hasTrailer = true;
                                }


                                if (termsAndConditions.isSelected() == true){


                                    C_Truck c_truck = new C_Truck(brandTxt.getText().toUpperCase(),String.valueOf(colorCombo.getValue()),Float.valueOf(priceTxT.getText()),termsAndConditions.isSelected(),String.valueOf(sizeComboBox.getValue()),Integer.valueOf(numbWheelsTxt.getText()),hasTrailer);
                                    c_automovileControler.setC_automovileArrayList(c_truck);
                                    Alert alert = new Alert(Alert.AlertType.INFORMATION,"TRUCK CREATED SUCCESFULLY");
                                    alert.show();
                                }else {
                                    Alert alert = new Alert(Alert.AlertType.ERROR,"PLEASE ACCEPT TERMS AND CONDITIONS TO CONTINUE");
                                    alert.show();
                                }



                            }catch (Exception e){
                                Alert alert = new Alert(Alert.AlertType.ERROR,"ERROR ON CREATING A CAR");
                                alert.show();
                            }

                        }else {
                            Alert alert =  new Alert(Alert.AlertType.ERROR,"PLEASE CHOOSE A AUTOMOVILE TYPE");
                            alert.show();
                        }
                    }
                });
                autoGridPane.add(addAuto,0,16);

                Button exit = new Button("EXIT MAIN MENU");
                exit.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        stage.setScene(scene);
                    }
                });
                autoGridPane.add(exit,1,16);







            }
        });
        mainGridPane.add(newAutoBtt,0,0);

        Button showListCarBtt = new Button("SHOW LIST OF CARS");
        showListCarBtt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                GridPane showList = new GridPane();
                showList.setAlignment(Pos.CENTER);
                showList.setVgap(15);
                showList.setHgap(15);
                Scene showListScene = new Scene(showList,1000,1000);
                stage.setScene(showListScene);



                ObservableList<String> observableList = FXCollections.observableArrayList();
                for (int i = 0; i < observableList.size();i++){
                    observableList.removeAll();
                }

                for (int i = 0; i < c_automovileControler.getC_automovileArrayList().size();i++){
                    C_Automovile item  = c_automovileControler.getC_automovileArrayList().get(i);

                    if (item instanceof C_Truck){
                        observableList.add("TRUCK: " + item.getBrand().toUpperCase() + " " + item.getColor() + " " + ((C_Truck) item).getSize() + " ;NUMB WHEELS: " + ((C_Truck) item).getWheels() + " ;HAS TRAILER: " + ((C_Truck) item).isTrailer() +" ->$" + item.getPrice());
                        continue;
                    }else if (item instanceof C_Car){
                        observableList.add("CAR: " + item.getBrand().toUpperCase() + " " + item.getColor() + " " + ((C_Car) item).getSize() + " ;NUMB WHEELS: " + ((C_Car) item).getWheels() + " ->$" + item.getPrice());
                        continue;
                    }


                }




                showList.add(new Label("SHOWING LIST OF CARS"),0,0);
                ListView listView = new ListView<>(observableList);
                listView.setMinWidth(500);
                showList.add(listView,0,1);







                Button exit = new Button("EXIT MAIN MENU");
                exit.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        stage.setScene(scene);
                    }
                });
                showList.add(exit,0,2);









            }
        });
        mainGridPane.add(showListCarBtt,1,0);

        Button showTableCarBtt = new Button("SHOW A TABLE OF AUTMOVILE");
        showTableCarBtt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                GridPane showTable = new GridPane();
                showTable.setAlignment(Pos.CENTER);
                showTable.setVgap(15);
                showTable.setHgap(15);
                Scene showTableScene = new Scene(showTable,1000,1000);
                stage.setScene(showTableScene);

                TableView tableView = new TableView<>();


                TableColumn <C_Automovile,String> column0 = new TableColumn<>("TYPE");
                column0.setCellValueFactory(new PropertyValueFactory<>("type"));

                TableColumn <C_Automovile,String> column1 = new TableColumn<>("BRAND");
                column1.setCellValueFactory(new PropertyValueFactory<>("brand"));

                TableColumn <C_Automovile,String> column2 = new TableColumn<>("COLOR");
                column2.setCellValueFactory(new PropertyValueFactory<>("color"));

                TableColumn <C_Automovile,String> column3 = new TableColumn<>("PRICE");
                column3.setCellValueFactory(new PropertyValueFactory<>("price"));

                TableColumn <C_Car,String> column4 = new TableColumn<>("SIZE");
                column4.setCellValueFactory(new PropertyValueFactory<>("size"));

                TableColumn <C_Car,String> column5 = new TableColumn<>("WHEELS");
                column5.setCellValueFactory(new PropertyValueFactory<>("wheels"));

                TableColumn <C_Automovile,Boolean> column6 = new TableColumn<>("TRAILER");
                column6.setCellValueFactory(new PropertyValueFactory<>("trailer"));

                TableColumn <C_Automovile,Boolean> column7 = new TableColumn<>("TERMS AND CONDITIONS");
                column7.setCellValueFactory(new PropertyValueFactory<>("termsAndConditions"));








                tableView.getColumns().add(column0);
                tableView.getColumns().add(column1);
                tableView.getColumns().add(column2);
                tableView.getColumns().add(column3);
                tableView.getColumns().add(column4);
                tableView.getColumns().add(column5);
                tableView.getColumns().add(column6);
                tableView.getColumns().add(column7);




                    ObservableList<C_Automovile> c_automovilesArr = FXCollections.observableArrayList();


                        for (int i = 0; i < c_automovileControler.getC_automovileArrayList().size();i++){
                            C_Automovile item  = c_automovileControler.getC_automovileArrayList().get(i);
                            c_automovilesArr.add(item);


                        }




                    tableView.setItems(c_automovilesArr);
                    showTable.add(tableView,0,1);




                Button exit = new Button("EXIT MAIN MENU");
                exit.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        stage.setScene(scene);
                    }
                });
                showTable.add(exit,0,2);










            }
        });
        mainGridPane.add(showTableCarBtt,2,0);








        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}