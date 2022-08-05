package com.example.estudioindependiente_4;

public class C_Truck extends C_Car {

    //DATA MEMBERS


    //FUNCTION MEMBERS
    public C_Truck(String brand, String color, float price,boolean termsAndcConditions, String size, int wheels, boolean trailer) throws Exception {
        super(brand, color, price, termsAndcConditions,size, wheels);
        setTrailer(trailer);
        setType("TRUCK");
    }


}
