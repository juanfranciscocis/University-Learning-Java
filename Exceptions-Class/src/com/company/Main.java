package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Sebas".charAt(10));
            System.out.println("Juan".charAt(10));
            System.out.println(1/0);
        }catch (ArithmeticException arithmeticException){
            System.err.println("DIVISION PARA 0");
        }catch (Exception exception){
            System.err.println("LOS NOMBRES TIENEN MENOS DE 10 CARACTERES");
        }








    }
}
