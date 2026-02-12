import java.util.Scanner;

public class Quiz{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy");
        System.out.println("Your answer: ");
        String answer1 = scan.nextLine().trim().toLowerCase();

        if (answer1.equals("c")) {
            score += 5;
        }

        System.out.println("2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        System.out.println("Your answer: ");
        String answer2 = scan.nextLine().trim().toLowerCase();

        if (answer2.equals("a")){
            score += 5;
        }
        System.out.println("3. What is the rarest blood type?");
        System.out.println("\ta) 0\n\tb) A\n\tc) B\n\td) AB-Negative");
        System.out.println("Your Answer: ");
        String answer3 = scan.nextLine().trim().toLowerCase();
        if (answer3.equals("d")) {
            score += 5;
        }
        System.out.println("4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermoine Granger\n\tc) Draco Malfoy");
        System.out.println("Your Answer: ");
        String answer4 = scan.nextLine().trim().toLowerCase();
        if (answer4.equals("a")){
            score += 5;
        } System.out.println("Your final score is: " + score + "/20");
        if (score >= 15) {
            System.out.println("Wow, you know your stuff!");
        } else if (score >= 5) {
            System.out.println("Not Bad!");
        } else {
            System.out.println("Better luck next time!");
        }
        scan.close();
    }
}