import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        int chatAge = 400;
        System.out.println("\nHello");
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWhat is your name?");
        String name = scanner.next();

        System.out.println("\nHi " + name + "! I'm JavaBot!");

        System.out.println("\nWhere are you from?");
        String location = scanner.next();

        System.out.println("\nI hear it's beautiful in " + location + " !");
        System.out.println("\nI'm from a place called Oracle.");

        System.out.println("\nHow old are you?");
        int age = scanner.nextInt();
        System.out.println("\nSo you're " + age + " , cool! I'm " + chatAge + " years old!");

        System.out.println("\nThis means I'm " + (chatAge / age) + " times older than you!");

        System.out.println("\nEnough about me. What's your favorite language? (Just don't say Python)");
        String language = scanner.next();

        System.out.println(language + ", that's great!" + "\nNice chatting with you " + name + "!" + "\nI have to log off now. See ya!");

        scanner.close();

    }
}


