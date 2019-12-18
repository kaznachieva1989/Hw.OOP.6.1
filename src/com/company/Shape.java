package com.company;

public class Shape<T extends Number> implements Drawable<String> {
    private T shape;
    private T sideA;
    private T sideB;

    public T getSideA() {
        return sideA;
    }

    public T getSideB() {
        return sideB;
    }


    @Override
    public void drawShapes(String shape) {
        System.out.print(shape);
    }
}
