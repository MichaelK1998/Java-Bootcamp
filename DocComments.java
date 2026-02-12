public class DocComments {
    public static void main(String[] args) {
        
    }

    /**
     * Function name: greet
     * 
     * Inside the function:
     * 1. prints: 'Hi'
     * 
     */
    public static void greet() {
    System.out.println("Hi");
}

/**
 * 
 * 
 * Function name: printText
 * @param name (String)
 * @param age (String)
 * 
 * Inside the function:
 * 1. This function prints the name and age as a text.
 */

public static void printText(String name, String age) {
    System.out.println("Hi I'm" + name + "and I'm" + age);
}


/**
 * Function name: calculateArea
 * @param length (double)
 * @param width (double)
 * @return (double)
 * 
 * 
 *Inside the Function:
 *1. this function calculates area and returns it.
 */
public static double calculateArea(double length, double width) {
    double area = length * width ;
    return area;   
}
}
