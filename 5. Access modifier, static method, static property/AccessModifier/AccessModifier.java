package AccessModifier;

public class AccessModifier {
    private double radius = 1;
    private String color = "red";

    public AccessModifier() {
    }

    public AccessModifier(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

