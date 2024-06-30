package no.hvl.dat100;

public class Circle extends Shape{
    public double radius;
    @Override
    double perimeter() {
        return 2* Math.PI*radius;

    }

    @Override
    double  area() {
        return Math.PI*radius*radius;

    }
}
