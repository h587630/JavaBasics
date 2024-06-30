package no.hvl.dat100;

public class Rectangle extends Shape{
    public double height;
    public double width;
    @Override
    double perimeter() {
        return 2* (height+width);
    }

    @Override
    double area() {
        return height*width/2;
    }
}
