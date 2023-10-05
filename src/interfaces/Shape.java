package interfaces;

interface Shape {
    double getArea();
    double getPerimeter();

    static int countShapes() {
        return 0;
    }

    default void displayInfo() {
        System.out.println("Shape Type: " + getClass().getSimpleName());
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
