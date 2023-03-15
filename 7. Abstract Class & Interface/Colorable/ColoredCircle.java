package Colorable;

public class ColoredCircle implements Colorable{
    private double radius;
    private String color;

    public ColoredCircle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void howToColor() {
        System.out.println("Color" + color + "circle");
    }
}
