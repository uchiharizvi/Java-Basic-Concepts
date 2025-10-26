package oops.abstraction.shape;

class Rectangle extends Shape {
    double length;
    double breadth;

    public Rectangle(String color, double length, double breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }

    @Override
    public String toString() {
        return "Rectangle color is " + super.getColor()
                + " and area is : " + area();
    }
}
