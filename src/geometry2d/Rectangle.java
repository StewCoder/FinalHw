package geometry2d;

public class Rectangle extends Geometry2D {
    private double width;
    private double height;

    // Constructor to initialize width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getter and setter methods for width and height
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Calculate the area of the rectangle
    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return String.format("Rectangle [Width: %.2f, Height: %.2f, Area: %.2f]", width, height, calculateArea());
    }
}
