package com.example.gitcat;

public class Rectangle extends Shape {
    private int width;
    private int height;

    private String color;

    public Rectangle (int x, int y, int width, int height, String color){
        super(x, y);
        this.width = width;
        this.height = height;
        this.color = color;
    }
}
