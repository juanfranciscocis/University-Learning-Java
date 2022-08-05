package com.company;

public class GeometricFigures {
    //MEMBER METHODS
    GeometricFigures(Rectangle rect ,Circle circ){
        this.rect = rect;
        this.circ = circ;
    }

    //GETTERS AND SETTERS
    public Rectangle getRect() {
        return rect;
    }

    public void setRect(Rectangle rect) {
        this.rect = rect;
    }

    public Circle getCirc() {
        return circ;
    }

    public void setCirc(Circle circ) {
        this.circ = circ;
    }

    //GRATEST AREA = SHOWS THE FIGURE WITH THE GRATEST AREA
    public float figureGratestArea(Rectangle[] rectArr,Circle[] circArr){
        float max;
        float theMaxRect = rectArr[0].areaRectangle(rectArr[0].getLongA(),rectArr[0].getLongB());


        for (int i = 0; i < rectArr.length ; i++){
            max = rectArr[i].areaRectangle(rectArr[i].getLongA(),rectArr[i].getLongB());

            if (max >= theMaxRect){
                theMaxRect = max;
            }

        }

        float theMaximum = theMaxRect;
        for (int i = 0; i < circArr.length;i++){
            if (circArr[i].areaCircle(circArr[i].getPi(),circArr[i].getRadius()) >= theMaxRect){
                theMaximum = circArr[i].perimeterCircle(circArr[i].getPi(),circArr[i].getRadius());
            }
        }

        return theMaximum;

    }

    //LOWEST PERIMETER = SHOWS THE FIGURE WITH THE GRATEST PERIMETER
    public float figureLowestPerimeter(Rectangle[] rectArr,Circle[] circArr){
        float minum;
        float theMinimumRect = rectArr[0].perimeterRectangle(rectArr[0].getLongA(),rectArr[0].getLongB());


        for (int i = 0; i < rectArr.length ; i++){
            minum = rectArr[i].perimeterRectangle(rectArr[i].getLongA(),rectArr[i].getLongB());

            if (minum <= theMinimumRect){
                theMinimumRect = minum;
            }

        }

        float theMinimum = theMinimumRect;
        for (int i = 0; i < circArr.length;i++){
            if (circArr[i].perimeterCircle(circArr[i].getPi(),circArr[i].getRadius()) <= theMinimumRect){
                theMinimum = circArr[i].perimeterCircle(circArr[i].getPi(),circArr[i].getRadius());
            }
        }

        return theMinimum;

    }

    //DATA MEMBERS
    private Rectangle rect;
    private Circle circ;


}
