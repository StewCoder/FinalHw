package geometry2d;

/**
 * The Circle class represents a 2D geometric circle.
 * It extends the {@link Geometry2D} class and provides methods to
 * calculate the area and manage the circle's radius.
 * <p>
 * The circle is defined by its radius and can calculate its area using the formula: 
 * Area = π * radius².
 * </p>
 */
public class Circle extends Geometry2D {

    private double radius;

    /**
     * Constructor to initialize the circle with a specific radius.
     *
     * @param radius The radius of the circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Gets the radius of the circle.
     *
     * @return The radius of the circle.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets a new value for the radius of the circle.
     *
     * @param radius The new radius of the circle.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle using the formula:
     * Area = π * radius².
     *
     * @return The area of the circle.
     */
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Returns a string representation of the circle, including its radius and area.
     * The format is:
     * <pre>
     * Circle [Radius: radius, Area: area]
     * </pre>
     *
     * @return A string representation of the circle.
     */
    @Override
    public String toString() {
        return String.format("Circle [Radius: %.2f, Area: %.2f]", radius, calculateArea());
    }
}
