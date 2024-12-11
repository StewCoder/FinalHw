package geometry2d;
/**
 * The Geometry2D class is an abstract class that serves as a base for all 2D geometric shapes.
 * <p>
 * Subclasses of {@link Geometry2D} should provide specific implementations of the {@link #calculateArea()}
 * method to compute the area based on the shape's unique properties.
 * </p>
 */

public abstract class Geometry2D {
    // Abstract method to calculate area, each subclass will implement this
    public abstract double calculateArea();

    @Override
    public abstract String toString();
}
