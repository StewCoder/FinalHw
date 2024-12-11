package geometry3d;

/**
 * The TriangularPrism class represents a 3D geometric triangular prism.
 * It extends the {@link Geometry3D} class and provides methods to
 * calculate the volume and manage the triangular prism's base, height, and length.
 * <p>
 * The triangular prism is defined by its base, height, and length, and the volume can be calculated
 * using the formula: Volume = 0.5 * base * height * length.
 * </p>
 */
public class TriangularPrism extends Geometry3D {

    private double base;
    private double height;
    private double length;

    /**
     * Constructor to initialize the triangular prism with a specific base, height, and length.
     *
     * @param base The base of the triangle (the triangular cross-section).
     * @param height The height of the triangle (the triangular cross-section).
     * @param length The length of the prism (the depth of the prism).
     */
    public TriangularPrism(double base, double height, double length) {
        this.base = base;
        this.height = height;
        this.length = length;
    }

    /**
     * Gets the base of the triangular prism.
     *
     * @return The base of the triangular prism.
     */
    public double getBase() {
        return base;
    }

    /**
     * Sets a new value for the base of the triangular prism.
     *
     * @param base The new base of the triangular prism.
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Gets the height of the triangular prism.
     *
     * @return The height of the triangular prism.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets a new value for the height of the triangular prism.
     *
     * @param height The new height of the triangular prism.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Gets the length of the triangular prism.
     *
     * @return The length of the triangular prism.
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets a new value for the length of the triangular prism.
     *
     * @param length The new length of the triangular prism.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calculates the volume of the triangular prism using the formula:
     * Volume = 0.5 * base * height * length.
     *
     * @return The volume of the triangular prism.
     */
    @Override
    public double calculateVolume() {
        return (0.5 * base * height) * length;
    }

    /**
     * Returns a string representation of the triangular prism, including its base, height, length, and volume.
     * The format is:
     * <pre>
     * TriangularPrism [Base: base, Height: height, Length: length, Volume: volume]
     * </pre>
     *
     * @return A string representation of the triangular prism.
     */
    @Override
    public String toString() {
        return String.format("TriangularPrism [Base: %.2f, Height: %.2f, Length: %.2f, Volume: %.2f]", 
                             base, height, length, calculateVolume());
    }
}
