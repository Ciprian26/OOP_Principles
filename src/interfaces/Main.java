package interfaces;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 4);
        Shape circle = new Circle(3);

        rectangle.displayInfo();
        System.out.println();

        circle.displayInfo();

        System.out.println("Total Shapes Created: " + Shape.countShapes());
        System.out.println("Rectangles Created: " + Rectangle.countShapes());
        System.out.println("Circles Created: " + Circle.countShapes());
    }
}
