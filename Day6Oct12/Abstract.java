package Day6Oct12;

abstract class Shape {
    private String color;
    void setColor(String color){
        this.color=color;
    }

    String getColor(){
        return color;
    }

    abstract double calculateArea();
}


class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius=radius;
    }
    @Override
    double calculateArea(){
        return (3.14) * radius * radius;
    }
}

class Rectangle extends Shape{
    double length,breadth;

    Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    double calculateArea(){
        return length * breadth;
    }
}