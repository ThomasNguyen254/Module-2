package Colorable;

public class Main {
    public static void main(String[] args) {
        Colorable[] shapes = new Colorable[3];
        shapes[0] = new Square(5);
        shapes[1] = new ColoredRectangle(4, 6, "blue");
        shapes[2] = new ColoredCircle(3, "red");

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Colorable) {
                ((Colorable)shapes[i]).howToColor();
            }
        }
    }
}
