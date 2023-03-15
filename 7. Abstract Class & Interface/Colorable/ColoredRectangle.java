package Colorable;

public class ColoredRectangle implements Colorable {
    private double width;
    private double height;
    private String color;

    public ColoredRectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getArea(){
        return width * height;
    }

    public void howToColor() {
        System.out.println("Color the" + color + " rectangle");
    }
}

