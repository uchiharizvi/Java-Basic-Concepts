package oops.abstraction.shape;

/** An abstract class can be created using abstract keyword
 * default access modifier is package
 */
abstract class Shape {
    String color;
    abstract double area();//abstract method
    public abstract String toString();


    /**
     * abstact class can have a constructor
     * @param color
     */
    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
