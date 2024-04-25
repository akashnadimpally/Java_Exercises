public class Circle extends Shape {
    private double radius;

    Circle(String ShapeName, double radius) {
        super(ShapeName);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}
