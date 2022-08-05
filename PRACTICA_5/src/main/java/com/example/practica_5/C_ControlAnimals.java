package com.example.practica_5;

import java.util.ArrayList;

public class C_ControlAnimals {

    //DATA MEMBERS
    private ArrayList <C_Animal> c_animals = new ArrayList<>();
    private int countDog = 0;
    private int countCat = 0;
    private int countOwl = 0;

    //FUCNTION MEMBERS
    //CONSTRUCTOR
    C_ControlAnimals(){}

    //SETTERS AND GETTERS
    public void setC_animals(C_Animal animal){
        this.c_animals.add(animal);
    }

    public int getCountDog() {
        return countDog;
    }

    public int getCountCat() {
        return countCat;
    }

    public int getCountOwl() {
        return countOwl;
    }

    public void setCountDog(int countDog) {
        this.countDog = countDog;
    }

    public void setCountCat(int countCat) {
        this.countCat = countCat;
    }

    public void setCountOwl(int countOwl) {
        this.countOwl = countOwl;
    }

    //COUNTING ANIMALS
    public void countAnimals() {

        for (int i = 0 ; i < c_animals.size();i++){
            if (c_animals.get(i) instanceof C_Dog){
                countDog+=1;
            } else if (c_animals.get(i)instanceof C_Cat){
                countCat+=1;
            }else {
                countOwl+=1;
            }

        }

        System.out.println("COUNT DOG: "+ countDog);
        System.out.println("COUNT CAT: "+countCat);
        System.out.println("COUNT OWL: "+countOwl);

    }

    public void runningFlight(){
        System.out.println();
        for (int i = 0 ; i < c_animals.size();i++){
            if (c_animals.get(i) instanceof C_Dog){
                System.out.println("OBJECT DOG NUMBER:" + i + " RUNS?: " + c_animals.get(i).getRun());
                System.out.println("OBJECT DOG NUMBER:" + i + " FLIGHTS?: " + c_animals.get(i).flights());
                System.out.println();
            } else if (c_animals.get(i)instanceof C_Cat){
                System.out.println("OBJECT CAT NUMBER:" + i + " RUNS?: "+ c_animals.get(i).getRun());
                System.out.println("OBJECT DOG NUMBER:" + i + " FLIGHTS?: " + c_animals.get(i).flights());
                System.out.println();
            }else {
                System.out.println("OBJECT OWL NUMBER:" + i + " RUNS?: " + c_animals.get(i).getRun());
                System.out.println("OBJECT OWL NUMBER:" + i + " FLIGHTS?: " + c_animals.get(i).flights());
                System.out.println();

            }

        }
    }





}
