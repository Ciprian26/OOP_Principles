package interfaces;

class Circle implements Shape {
    private double radius;
    private static int circleCount = 0;

    public Circle(double radius) {
        this.radius = radius;
        circleCount++;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public static int countShapes() {
        return circleCount;
    }
}