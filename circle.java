interface Shape {
    double area();
    double perimeter();
}
class Rectangle implements Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double area() {
        return length * width;
    }
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}
class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
public class circle {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 7);
        System.out.printf("Rectangle\nArea: %.1f, Perimeter: %.1f\n", rectangle.area(), rectangle.perimeter());
        Shape circle = new Circle(3.5);
        System.out.printf("Circle\nArea: %.5f, Perimeter: %.5f\n", circle.area(), circle.perimeter());
    }
}
