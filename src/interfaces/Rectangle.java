package interfaces;

class Rectangle implements Shape {
    private double width;
    private double height;
    private static int rectangleCount = 0;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        rectangleCount++;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    public static int countShapes() {
        return rectangleCount;
    }
}
