public class SwitchStatements {
    public static void main(String[] args) {

        String weather = "rainy";
        switch (weather) {
            case "sunny": System.out.println("You can wear a shirt"); break;
            case "cloudy":System.out.println("You should wear a sweater"); break;
            case "rainy": System.out.println("You should wear a raincoat"); break;
            case "snowy": System.out.println("You should wear a jacket"); break;
            default: System.out.println("You can wear whatever you want"); 
        }

        int role = 2;
        switch (role) {
            case 1: System.out.println("You are an admin!"); break;
            case 2: System.out.println("You are an editor!"); break;
            case 3: System.out.println("You are a user!"); break;
            default: System.out.println("Please contact HR!"); 
            
        }

        int temperature = 75;
        int humidity = 65;

        if (temperature >= 80 && humidity >= 60) {
            System.out.println("It's too hot and humid.\n");
        } else if (temperature >= 80) {
            System.out.println("It's too hot \n");
        } else if (temperature <= 60 && humidity >= 60) {
            System.out.println("It's too cold and humid\n");
        } else if (temperature <= 60) {
            System.out.println("It's too cold.\n");
        } else {
            System.out.println("It's comfortable.");
        }

        int age = 25;
        int income = 50000;

        if (age >= 18 && age <= 60 && income >= 30000) {
            System.out.println("Congratulations you are eligible for the credit card.\n");
        } else {
            System.out.println("Sorry you are not eligible for a credit card. \n");
        }


        String lightColor = "green";

        switch (lightColor) {
            case "red": System.out.println("Stop!"); break;
            case "yellow": System.out.println("Slow down!"); break;
            case "green": System.out.println("Go!"); break;
        
            default: System.out.println("Power outage.\n");
        }


        int grade = 85;

        if (grade >= 85){
            System.out.println("You got an A!");
        }
        else if (grade >= 70){
        System.out.println("You got a B!");
        }
        else if (grade >= 60) {
        System.out.println("You got a C.");
        }
        else if (grade >= 50){
        System.out.println("You got a D.");
        }
        else {System.out.println("You failed :(");


        String browser = "Chrome";

        switch (browser) {
            case "Chrome": System.out.println("Enjoy your Chrome extensions!\n"); break;
            case "Firefox": System.out.println("The best nonprofit browser!\n"); break;
            case "Safari": System.out.println("I see you're a proud Apple user!\n"); break;
            default: System.out.println("Curious? What browser do you use?");
        }

        

        }}}