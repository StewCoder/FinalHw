package geometry2d;

/**
 * The Triangle class represents a 2D geometric triangle.
 * It extends the {@link Geometry2D} class and provides methods to
 * calculate the area and manage the triangle's base and height.
 * <p>
 * The triangle is defined by its base and height, and the area can be calculated 
 * using the formula: Area = 0.5 * base * height.
 * </p>
 */
public class Triangle extends Geometry2D {

    private double base;
    private double height;

    /**
     * Constructor to initialize the triangle with a specific base and height.
     *
     * @param base The base of the triangle.
     * @param height The height of the triangle.
     */
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    /**
     * Gets the base of the triangle.
     *
     * @return The base of the triangle.
     */
    public double getBase() {
        return base;
    }

    /**
     * Sets a new value for the base of the triangle.
     *
     * @param base The new base of the triangle.
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Gets the height of the triangle.
     *
     * @return The height of the triangle.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets a new value for the height of the triangle.
     *
     * @param height The new height of the triangle.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Calculates the area of the triangle using the formula:
     * Area = 0.5 * base * height.
     *
     * @return The area of the triangle.
     */
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    /**
     * Returns a string representation of the triangle, including its base, height, and area.
     * The format is:
     * <pre>
     * Triangle [Base: base, Height: height, Area: area]
     * </pre>
     *
     * @return A string representation of the triangle.
     */
    @Override
    public String toString() {
        return String.format("Triangle [Base: %.2f, Height: %.2f, Area: %.2f]", base, height, calculateArea());
    }
}
