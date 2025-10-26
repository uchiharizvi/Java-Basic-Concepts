package oops.abstraction.shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 2);
        Shape rectangle = new Rectangle("Blue", 2, 4);
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
    }
}
