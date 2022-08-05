package com.example.laboratorio_4;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class GuiFx extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        GridPane mainGrid = new GridPane();
        Scene scene = new Scene(mainGrid, 1000, 1000);
        mainGrid.setVgap(15);
        mainGrid.setHgap(15);
        mainGrid.setAlignment(Pos.CENTER);

        C_ConsultorioMedico c_consultorioMedico = new C_ConsultorioMedico();

        //MAIN EMBARAZADAS
        TextField nombreTxt = new TextField();
        ToggleGroup si_no = new ToggleGroup();
        RadioButton noEnRiesgoCheckBox = new RadioButton("NO");
        noEnRiesgoCheckBox.setToggleGroup(si_no);
        noEnRiesgoCheckBox.setSelected(true);
        RadioButton siEnRiesgoCheckBox = new RadioButton("SI");
        siEnRiesgoCheckBox.setToggleGroup(si_no);
        TextField numeroDeHistTxt = new TextField();
        numeroDeHistTxt.setMaxWidth(50);
        Button nuevaEmbarazada = new Button("AGREGAR NUEVA EMBARAZADA");
        ObservableList<String> examanesComboInfo = FXCollections.observableArrayList("EXAMEN NORMAL","EXAMEN AMNEOSINTESIS","EXAMEN PTG");
        ComboBox examenesComboBox = new ComboBox(examanesComboInfo);
        Button agregarExamen = new Button("AGREGAR EXAMEN");


        //EXAMEN NORMAL
        TextField nombreExamen  = new TextField();
        ToggleGroup examenNormal = new ToggleGroup();
        RadioButton positivoNormal = new RadioButton("POSITIVO");
        positivoNormal.setToggleGroup(examenNormal);
        RadioButton negativoNormal = new RadioButton("NEGATIVO");
        negativoNormal.setToggleGroup(examenNormal);
        TextField histClinicaTxt = new TextField();
        histClinicaTxt.setMaxWidth(50);




        Button embarazadaNormalBtt = new Button("EMBARAZADA NORMAL");
        embarazadaNormalBtt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                mainGrid.add(new Label("INGRESE EL NOMBRE"),0,1);
                mainGrid.add(nombreTxt,0,2);
                mainGrid.add(new Label("SE ENCUENTRA ESTA EMBARAZADA EN RIESGO?"),0,3);
                mainGrid.add(siEnRiesgoCheckBox,1,3);
                mainGrid.add(noEnRiesgoCheckBox,2,3);
                mainGrid.add(new Label("NUMERO DE HISTORIA CLINICA ASIGNADO"),0,4);
                mainGrid.add(numeroDeHistTxt,1,4);
                mainGrid.add(nuevaEmbarazada,3,5);

                nuevaEmbarazada.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {

                        C_Embarazadas embarazadas = new C_Embarazadas(nombreTxt.getText(),Integer.valueOf(numeroDeHistTxt.getText()));
                        RadioButton selected = (RadioButton)si_no.getSelectedToggle();
                        System.out.println(selected.getText());
                        if (selected.getText() == "SI"){
                            embarazadas.setEnRiesgo(true);
                        }else {
                            embarazadas.setEnRiesgo(false);
                        }
                        c_consultorioMedico.setEmbarazadasArrayList(embarazadas);
                    }
                });
            }
        });
        mainGrid.add(embarazadaNormalBtt,0,0);

        Button agregarExamenesBtt = new Button("EXAMEN NUEVO");
        agregarExamenesBtt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                GridPane examenesGrid = new GridPane();
                examenesGrid.setAlignment(Pos.CENTER);
                examenesGrid.setHgap(15);
                examenesGrid.setVgap(15);


                Scene examenesScene = new Scene(examenesGrid,1000,1000);

                stage.setScene(examenesScene);



                examenesGrid.add(examenesComboBox,0,6);
                examenesGrid.add(agregarExamen,1,6);

                agregarExamen.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        examenesGrid.add(new Label("INGRESE EL NUMERO DE HISTORIA CLINICA"),0,7);
                        examenesGrid.add(histClinicaTxt,1,7);

                        examenesGrid.add(new Label("EL EXAMEN ES POSITIVO O NEGATIVO"),0,10);
                        examenesGrid.add(positivoNormal,1,10);
                        examenesGrid.add(negativoNormal,2,10);

                        if (examenesComboBox.getValue() == "EXAMEN NORMAL"){

                            examenesGrid.add(new Label("INGRESE EL NOMBRE DEL EXAMEN REALIZADO"),0,8);
                            examenesGrid.add(nombreExamen,0,9);

                            Button agregarExamenNormalBtt = new Button("AGREGAR EXAMEN A LA PACIENTE");
                            examenesGrid.add(agregarExamenNormalBtt,0,11);
                            agregarExamenNormalBtt.setOnAction(new EventHandler<ActionEvent>() {
                                @Override
                                public void handle(ActionEvent actionEvent) {



                                    try {
                                        boolean pos_neg = false;

                                        RadioButton selected = (RadioButton) examenNormal.getSelectedToggle();
                                        //System.out.println(selected.getText());
                                        if (selected.getText() == "POSITIVO") {
                                            pos_neg = true;
                                        } else {
                                            pos_neg = false;
                                        }
                                        C_Examenes c_examenes = new C_Examenes(nombreExamen.getText(), pos_neg);

                                        c_consultorioMedico.getEmbarazadasArrayList().get(Integer.valueOf(histClinicaTxt.getText()) - 1).examanesArrayList.add(c_examenes);
                                        Alert creadoExamenNormal = new Alert(Alert.AlertType.INFORMATION, "SE AGREGO EXITOSAMENTE EL EXAMEN A LA EMBARAZADA " + c_consultorioMedico.getEmbarazadasArrayList().get(Integer.valueOf(histClinicaTxt.getText()) - 1).getNombre());
                                        creadoExamenNormal.show();
                                        stage.setScene(scene);
                                    }catch (Exception e){
                                        Alert creadoExamenNormal = new Alert(Alert.AlertType.ERROR,"ERROR EN LA ASIGNACION DE EXAMEN");
                                        creadoExamenNormal.show();
                                    }


                                }
                            });


                        }else if(examenesComboBox.getValue() == "EXAMEN AMNEOSINTESIS"){
                            Button agregarExamenABtt = new Button("AGREGAR EXAMEN A LA PACIENTE");
                            examenesGrid.add(agregarExamenABtt,0,11);
                            agregarExamenABtt.setOnAction(new EventHandler<ActionEvent>() {
                                @Override
                                public void handle(ActionEvent actionEvent) {
                                    try {
                                        boolean pos_neg = false;

                                        RadioButton selected = (RadioButton) examenNormal.getSelectedToggle();
                                        //System.out.println(selected.getText());
                                        if (selected.getText() == "POSITIVO") {
                                            pos_neg = true;
                                        } else {
                                            pos_neg = false;
                                        }


                                        C_ExamenAmneosentesis c_examenAmneosentesis = new C_ExamenAmneosentesis("AMNEOSENTESIS",pos_neg);
                                        c_consultorioMedico.getEmbarazadasArrayList().get(Integer.valueOf(histClinicaTxt.getText()) - 1).examanesArrayList.add(c_examenAmneosentesis);
                                        Alert creadoExamenNormal = new Alert(Alert.AlertType.INFORMATION, "SE AGREGO EXITOSAMENTE EL EXAMEN A LA EMBARAZADA " + c_consultorioMedico.getEmbarazadasArrayList().get(Integer.valueOf(histClinicaTxt.getText()) - 1).getNombre());
                                        creadoExamenNormal.show();

                                    }catch (Exception e){
                                        Alert creadoExamenNormal = new Alert(Alert.AlertType.ERROR,"ERROR EN LA ASIGNACION DE EXAMEN");
                                        creadoExamenNormal.show();
                                    }
                                }
                            });


                        }



                    }
                });

            }
        });
        mainGrid.add(agregarExamenesBtt,1,0);






        stage.setTitle("EMBARAZADAS");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}