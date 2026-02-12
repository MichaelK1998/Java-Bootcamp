public class Scope {
    

        static double length = 2;
        static double width = 4;
    public static void main(String[] args) {

        System.out.println("Length : " + length);
        System.out.println("Length : " + width + "\n");

        calculateArea();
        calculatePerimeter();

    }

    public static void calculateArea() {
        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }

    public static void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}