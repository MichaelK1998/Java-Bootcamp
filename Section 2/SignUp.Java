import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nThank you for joining JavaGram!");
        System.out.println("What is your first name?");
        String firstName = scanner.next();
        
        System.out.println("What is your last name?");
        String lastName = scanner.next();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("Make a username");
        String username = scanner.next();

        System.out.println("What city do you live in?");
        String city = scanner.next();

        System.out.println("What country is that?");
        String country = scanner.next();

        
        System.out.println("\nHere is your information:");
        System.out.println("\tFirst Name: " + firstName);
        System.out.println("\tLast Name: " + lastName);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + username);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);
    }
}