package main;
import java.util.Scanner;
import java.util.LinkedList;
import geometry2d.*;
import geometry3d.*;

/**
 * The Main class is the entry point for the geometry management application.
 * It allows users to interact with a collection of geometries (both 2D and 3D), 
 * including adding new geometries, removing them, and listing all stored geometries.
 * The application uses a menu-driven interface in the console.
 * <p>
 * This class relies on the following:
 * - A {@link LinkedList} to store geometries of various types.
 * - {@link geometry2d} and {@link geometry3d} packages to represent 2D and 3D geometries respectively.
 * </p>
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Object> geometries = new LinkedList<>(); // Using java.util.LinkedList

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Geometry");
            System.out.println("2. Remove Geometry");
            System.out.println("3. List All Geometries");
            System.out.println("4. Exit");
            System.out.print("> ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addGeometry(scanner, geometries);
                case 2 -> removeGeometry(scanner, geometries);
                case 3 -> listGeometries(geometries);
                case 4 -> {
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    /**
     * Adds a new geometry to the {@link LinkedList} of geometries. The user is prompted
     * to select the type of geometry they want to add (e.g., Rectangle, Circle, etc.) and
     * provide the necessary dimensions for that geometry.
     * <p>
     * The following types of geometries can be added:
     * - Rectangle
     * - Circle
     * - Triangle
     * - Sphere
     * - Triangular Prism
     * </p>
     *
     * @param scanner A {@link Scanner} instance used to capture user input.
     * @param geometries A {@link LinkedList} that holds the geometries.
     */
    private static void addGeometry(Scanner scanner, LinkedList<Object> geometries) {
        System.out.println("\nChoose type:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Triangle");
        System.out.println("4. Sphere");
        System.out.println("5. Triangular Prism");
        System.out.print("> ");
        int type = scanner.nextInt();

        switch (type) {
            case 1 -> {
                System.out.print("Enter width and height: ");
                double width = scanner.nextDouble();
                double height = scanner.nextDouble();
                geometries.add(new Rectangle(width, height));
            }
            case 2 -> {
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                geometries.add(new Circle(radius));
            }
            case 3 -> {
                System.out.print("Enter base and height: ");
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                geometries.add(new Triangle(base, height));
            }
            case 4 -> {
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                geometries.add(new Sphere(radius));
            }
            case 5 -> {
                System.out.print("Enter base, height, and length: ");
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                double length = scanner.nextDouble();
                geometries.add(new TriangularPrism(base, height, length));
            }
            default -> System.out.println("Invalid type. Try again.");
        }
    }

    /**
     * Removes a geometry from the list based on the index provided by the user.
     * <p>
     * This method first checks if the list of geometries is empty. If not, it displays
     * a list of the current geometries with their indices and prompts the user to
     * select an index for removal. The selected geometry is then removed from the list.
     * If the user provides an invalid index, an error message is shown.
     * </p>
     *
     * @param scanner The {@link Scanner} object used to read user input.
     * @param geometries The {@link LinkedList} of geometries from which an item will be removed.
     */
    private static void removeGeometry(Scanner scanner, LinkedList<Object> geometries) {
        if (geometries.isEmpty()) {
            System.out.println("\nNo geometries to remove.");
            return;
        }

        System.out.println("\nChoose the index of the geometry to remove (0 to " + (geometries.size() - 1) + "):");
        for (int i = 0; i < geometries.size(); i++) {
            System.out.println(i + ". " + geometries.get(i));
        }
        System.out.print("> ");
        int index = scanner.nextInt();

        if (index >= 0 && index < geometries.size()) {
            geometries.remove(index);
            System.out.println("\nGeometry removed.");
        } else {
            System.out.println("\nInvalid index.");
        }
    }

    /**
     * Lists all stored geometries in the {@link LinkedList}. Each geometry's 
     * {@link Object#toString()} method is called to display relevant information.
     * 
     * @param geometries A {@link LinkedList} that holds the geometries.
     */
    private static void listGeometries(LinkedList<Object> geometries) {
        System.out.println("\nStored Geometries:");
        for (Object geometry : geometries) {
            System.out.println(geometry); // This calls the toString() method of each geometry
        }
    }
}
