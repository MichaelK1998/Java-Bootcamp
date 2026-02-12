import java.util.Scanner;
public class JavaDraw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWhich animal would you like to draw?");
        System.out.println("Write 1 for butterfly ");
        System.out.println("Write 2 for elephant  ");
        System.out.println("Write 3 for bear      ");
        System.out.println("Write 4 for snake     ");

        int choice = scanner.nextInt();

        draw(choice);

        scanner.close();
    }
    public static void draw(int choice) {

        switch (choice) {
            case 1:
                drawButterfly();
                break;
            case 2:
                drawElephant();
                break;
            case 3:
                drawBear();
                break;
            case 4:
                drawSnake();
                break;
            default:
                System.out.println("Sorry, invalid choice. Please choose 1, 2, 3 or 4.");
                break;
        }
    }

    private static void drawButterfly() {
        System.out.println("     _             _");
        System.out.println("   .' `.         .' `.");
        System.out.println("  /     \\       /     \\");
        System.out.println(" |   ^   |     |   ^   |");
        System.out.println("  \\  O  /       \\  O  /");
        System.out.println("   `._.'         `._.'");
        System.out.println("     ||           ||");
        System.out.println("    _||_         _||_");
        System.out.println("   /    \\       /    \\");
    }

    private static void drawElephant() {
        

}
    private static void drawBear() {

}

    private static void drawSnake() {
    }

}

