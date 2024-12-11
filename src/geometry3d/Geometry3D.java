package geometry3d;

/**
 * The Geometry3D class is an abstract class that serves as a base for all 3D geometric shapes.
 * It defines a blueprint for calculating the volume of a 3D shape and provides an abstract method
 * that each subclass must implement to calculate its specific volume.
 * <p>
 * Subclasses of {@link Geometry3D} should provide specific implementations of the {@link #calculateVolume()}
 * method to compute the volume based on the shape's unique properties.
 * </p>
 */
public abstract class Geometry3D {

    /**
     * Abstract method to calculate the volume of a 3D shape.
     * <p>
     * Each subclass of {@link Geometry3D} must implement this method to calculate
     * its volume based on the specific properties of the shape (e.g., radius, base, height, length).
     * </p>
     *
     * @return The volume of the 3D shape.
     */
    public abstract double calculateVolume();

    /**
     * Abstract method that returns a string representation of the 3D shape.
     * <p>
     * Each subclass must implement this method to return a string that represents
     * the shape, including relevant properties and calculated volume.
     * </p>
     *
     * @return A string representation of the 3D shape.
     */
    @Override
    public abstract String toString();
}
