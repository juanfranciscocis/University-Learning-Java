package com.example.ei3;

import javafx.scene.control.Alert;

public class Triangulo extends Poligono{
    private float hypotenuse;

    public Triangulo(float width, float height, float hipotenusa, int resize){
        super(width, height);
        this.hypotenuse = hipotenusa;
        resize(resize);
    }

    public Triangulo(){
        super();
    }

    public float getHipotenusa() {
        return hypotenuse;
    }

    public void setHipotenusa(float hipotenusa) {
        this.hypotenuse = hipotenusa;
    }

    @Override
    public float area() {
        return super.area()/2;
    }

    public float perimetro(){
        return width + height + hypotenuse;
    }

    public void resize(int factor){



        if (factor < 0 && width/factor >0 && height/factor>0 && hypotenuse/factor >0){
            width = width/factor;
            height = height/factor;
            hypotenuse = hypotenuse/factor;
        }else if (factor > 0 && width*factor >0 && height*factor>0 && hypotenuse*factor >0) {
            width = width * factor;
            height = height * factor;
            hypotenuse = hypotenuse * factor;
        }else if (width/factor <0 || height/factor<0 || hypotenuse/factor <0){
            MyException myException = new MyException(4);
            Alert alert = new Alert(Alert.AlertType.ERROR,myException.errorMessage());
            alert.show();
        }else if (width*factor <0 || height*factor<0 || hypotenuse*factor <0){
            MyException myException = new MyException(4);
            Alert alert = new Alert(Alert.AlertType.ERROR,myException.errorMessage());
            alert.show();
        }else {
            MyException myException = new MyException(3);
            Alert alert = new Alert(Alert.AlertType.ERROR,myException.errorMessage());
            alert.show();
        }












    }
}
