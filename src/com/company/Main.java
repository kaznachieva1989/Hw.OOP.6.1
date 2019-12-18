package com.company;

class Rectangle<T extends Number> extends Shape<T> {
}

class Square<T extends Number> extends Shape<T> {
}

public class Main {

    public static void main(String[] args) {
        Shape<Float> rectangleShape = new Shape<Float>();
        Shape<Double> squareShape = new Shape<Double>();
        rectangleShape.drawShapes("\uD83D\uDDBE ");
        System.out.println("areaOfRectangle = " + areaOfRectangle(5, 7));
        squareShape.drawShapes("\uD83D\uDD32 ");
        System.out.println("areaOfSquare = " + areaOfSquare(5));

    }

    public static Number areaOfRectangle(int sideA, int sideB) {
        return sideA * sideB;
    }

    public static Number areaOfSquare(int sideA) {
        return 4 * sideA;
    }
}
