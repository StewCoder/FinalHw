package geometry3d;

/**
 * The Sphere class represents a 3D geometric sphere.
 * It extends the {@link Geometry3D} class and provides methods to
 * calculate the volume and manage the sphere's radius.
 * <p>
 * The sphere is defined by its radius, and the volume can be calculated using the formula:
 * Volume = (4/3) * π * radius³.
 * </p>
 */
public class Sphere extends Geometry3D {

    private double radius;

    /**
     * Constructor to initialize the sphere with a specific radius.
     *
     * @param radius The radius of the sphere.
     */
    public Sphere(double radius) {
        this.radius = radius;
    }

    /**
     * Gets the radius of the sphere.
     *
     * @return The radius of the sphere.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets a new value for the radius of the sphere.
     *
     * @param radius The new radius of the sphere.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the volume of the sphere using the formula:
     * Volume = (4/3) * π * radius³.
     *
     * @return The volume of the sphere.
     */
    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    /**
     * Returns a string representation of the sphere, including its radius and volume.
     * The format is:
     * <pre>
     * Sphere [Radius: radius, Volume: volume]
     * </pre>
     *
     * @return A string representation of the sphere.
     */
    @Override
    public String toString() {
        return String.format("Sphere [Radius: %.2f, Volume: %.2f]", radius, calculateVolume());
    }
}
