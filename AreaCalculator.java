import java.util.Scanner;
public class AreaCalculator {

    public static void main(String[] args) {

        double squareArea = areaSquare(2.0);
        double rectangleArea = areaRectangle(1.0, 2.0);
        double triangleArea = areaTriangle(1.0, 2.0);
        double circleArea = areaCircle(2.0);

        printAreas(squareArea, rectangleArea, triangleArea, circleArea);

        System.out.println("\nThank you for using the area calculator");
    }

    // Calculates the area of a square
    public static double areaSquare(double side) {
        if (side < 0) {
            System.out.println("Impossible value for square side.");
            System.exit(0);
        }
        return side * side;
    }

    // Calculates the area of a rectangle
    public static double areaRectangle(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Impossible rectangle dimensions.");
            System.exit(0);
        }
        return length * width;
    }

    // Calculates the area of a triangle
    public static double areaTriangle(double base, double height) {
        if (base < 0 || height < 0) {
            System.out.println("Impossible triangle dimensions.");
            System.exit(0);
        }
        return (base * height) / 2;
    }

    // Calculates the area of a circle
    public static double areaCircle(double radius) {
        if (radius < 0) {
            System.out.println("Impossible circle radius.");
            System.exit(0);
        }
        return Math.PI * radius * radius;
    }

    // Prints all calculated areas
    public static void printAreas(double square, double rectangle,
                                  double triangle, double circle) {

        System.out.println("Square area: " + square);
        System.out.println("Rectangle area: " + rectangle);
        System.out.println("Triangle area: " + triangle);
        System.out.println("Circle area: " + circle);
    }
}
