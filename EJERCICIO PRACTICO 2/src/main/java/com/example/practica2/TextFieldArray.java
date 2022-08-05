package com.example.practica2;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.math.BigDecimal;
import java.util.Random;

public class TextFieldArray {

    //MEMBER METHODS
    //CONSTRUCTOR
    public TextFieldArray(){}

    //GETTER GRID PANE
    public GridPane getGridPane() {
        return gridPane;
    }



    //CREATING 100 TEXTFIELDS AND SAVING THEM IN THE ARRAY
    public void createTextFieldsAndStore(){
        //GENERATING THE ONES OR CEROS
        RandomOneORCero randomOneORCero = new RandomOneORCero();
        randomOneORCero.random1or0();
        //CREATING 100 TEXT FIELDS USING THE 1 ONES AND CEROS
        for (int i = 1; i < textFieldArray.length; i++){
            TextField textField = new TextField(String.valueOf(randomOneORCero.getArrayRandomNum()[i-1])); //TEXT FIELD OBJECT THAT DISPLAYS NUMBER 1 OR 0
            textField.setPrefWidth(30); //SET WIDTH OF TEXTFIELD TO 30PXL
            textFieldArray[i] = textField;//SAVING THE OBJECT IN THE ARRAY
            System.out.print(textFieldArray[i]);
            System.out.println(i);


        }
    }

    //SHOWING THE 100 TEXTFIELDS TO THE USER THROW FRONT END
    public void showTextFieldArrayFE(){
        //APPLYING SOME FORMAT TO THE GRIDPANE
        gridPane.setAlignment(Pos.CENTER); //CENTRO EL AGRUPAMIENTO EN LA VENTANA
            //SPACE BETWEEN PANELS
        gridPane.setHgap(0.5);
        gridPane.setVgap(0.5);

        //DISPLAYING THE 100 TEXTFIELDS
            //COUNTERS FOR NUMBER OF ROWS AND COLUMNS
        int counterRow = 0;
        int counterColumn = 0;
        for (int i = 1 ; i < textFieldArray.length;i++){
            gridPane.add(textFieldArray[i],counterColumn,counterRow); //ADING A TEXTFIELD IN THE GRID PANEL CORDENATE
            System.out.println(counterRow + "FILAS;"+counterColumn + "COLUMNA"); //PRINTING THE COORDINATE
            //MAKING THE MATRIX
            counterColumn++;
            if (counterColumn == 10){
                counterRow++;
                counterColumn = 0;
            }

        }


    }
    //DATA MEMBERS
    private final TextField[] textFieldArray = new TextField[101]; //ARRAY OF 100 TEXT FIELDS
    private final GridPane gridPane = new GridPane(); //GRIDPANE TO ORGANIZE THE 100 NODES IN THE FRONT END

    public static class RandomOneORCero{
        //MEMBER METHODS
        //CONSTRUCTOR
        public RandomOneORCero(){}

        //GETTER ARRAY RANDOM NUMBER
        public int[] getArrayRandomNum() {
            return arrayRandomNum;
        }


        //GENERATE AND STORE A 1 OR A 0
        public void random1or0(){
            for (int i = 0; i < arrayRandomNum.length ; i++){
                arrayRandomNum[i] = random.nextInt(2);
            }

        }


        //DATA MEMBER
        private final Random random = new Random();
        private final int[] arrayRandomNum = new int[100];
    }

}
