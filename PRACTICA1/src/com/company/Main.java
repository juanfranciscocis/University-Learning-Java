package com.company;

public class Main {

    public static void main(String[] args) {
        
        
        //CREATION OF A RECTANGLE AND A CIRCLE
        Rectangle rect1 = new Rectangle(2,2);
        Rectangle rect2 = new Rectangle(4,4);
        Circle circ1 = new Circle(6);


        //PRINTING RECT1 DATA
        System.out.print("PERIMETRO DEL RECTANGULO 1: ");
        System.out.println(rect1.perimeterRectangle(rect1.getLongA(), rect1.getLongB()));
        System.out.print("AREA DEL RECTANGULO 1: ");
        System.out.println(rect1.areaRectangle(rect1.getLongA(),rect1.getLongB()));

        //PRINTING RECT2 DATA
        System.out.print("PERIMETRO DEL RECTANGULO 2: ");
        System.out.println(rect2.perimeterRectangle(rect2.getLongA(), rect2.getLongB()));
        System.out.print("AREA DEL RECTANGULO 2: ");
        System.out.println(rect2.areaRectangle(rect2.getLongA(),rect2.getLongB()));
        System.out.println();

        //PRINTING CIRC1 DATA
        System.out.println();
        System.out.print("PERIMETRO DEL CIRCULO: ");
        System.out.println(circ1.perimeterCircle(circ1.getPi(),circ1.getRadius()));
        System.out.print("AREA DEL CIRCULO: ");
        System.out.println(circ1.areaCircle(circ1.getPi(), circ1.getRadius()));
        System.out.println();
        
        //USING THE GEOMETRIC FIGURE TO CONTROL
        GeometricFigures figur1 = new GeometricFigures(rect1,circ1);
        
        //CREATING ARRAYS FOR STORING CIRCLES AND RECTANGLES
        Rectangle[] rectArr = new Rectangle[2];
        rectArr[0] = rect1;
        rectArr[1]= rect2;

        Circle[] circArr = new Circle[1];
        circArr[0] = circ1;

        //PRINTING THE GRATEST AREA AND LOWEST PERIMETER FOUNDED
        System.out.println("MENOR PERIMETRO ENCONTRADO: "+ figur1.figureLowestPerimeter(rectArr,circArr));
        System.out.println("MAYOR AREA ENCONTRADA: "+ figur1.figureGratestArea(rectArr,circArr));


    }
}
