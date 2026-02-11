public class Calendar {
    public static void main(String[] args) {
        

        String day = "Friday"; 
        
        System.out.println("Hey, are you free on " + day + "? \n");


        System.out.println("Hmm, let me check my calendar.");
        
        switch (day) {
            case "Monday": System.out.println("Sorry, I have to stay at work late.\n");break;
            case "Tuesday": System.out.println("It looks like I have meetings all day.\n");break;
            case "Wednesday": System.out.println("I have a dentist appointment. Some other time!\n");break;
            case "Thursday": System.out.println("Sorry, thursday is date night!\n");break;
            case "Friday": System.out.println("I'm free!!\n");break;
            case "Saturday": System.out.println("I'm free!!\n");break;
            case "Sunday": System.out.println("I'm free!!\n");break;
        
            default: System.out.println("That's not a day.");
        }
        

    }
}