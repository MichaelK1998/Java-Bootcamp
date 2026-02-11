public class Championship {
    public static void main(String[] args) {
        
        int gryffindor = 900;
        int ravenclaw = 500;
        int pointsMargin = gryffindor - ravenclaw;

        if (pointsMargin >= 300){
            System.out.println("Gryffindor takes the house cup!");
        }
        else if (pointsMargin >= 0) {
            System.out.println("In second place, Gryffindor!");
        }
        else if (pointsMargin == -100){
            System.out.println("In third place, Gryffindor");
        }
        else {
            System.out.println("In fourth place, Gryffindor!");
        }

    }
}
