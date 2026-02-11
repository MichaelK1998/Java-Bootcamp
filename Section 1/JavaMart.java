public class JavaMart {
    public static void main(String[] args) {
        double wallet = 10;
        double kidsRequest = 12;
        System.out.println("Can you buy me this?");
        if (wallet == kidsRequest){
            System.out.println("Sure!");
        }
        else {
            System.out.println("Sorry, I have only " + wallet + "$ left");
        }

        int carPrice = 11500;
        int budget = 12000;
        if (carPrice <= budget){
            System.out.println("Sure!");
        }
        else {
            System.out.println("Sorry, your budget is not enough!");
        }

        int shoePrice = 95;
        wallet = 94.01;
        if (wallet > shoePrice){
            System.out.println("Sure!");
        }
        else {
            System.out.println("Sorry, I only have " + wallet + " left");
        }

    }


}
