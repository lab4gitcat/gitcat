package com.example.gitcat;


public class Square extends Shape {
    private int side; 

    public square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side; 
    } 

    public int getArea() {
        return side * side; 
    }
}
