import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declare scanner
        Scanner input = new Scanner(System.in);
        //Declare variables
        int numBoys = -1;
        int numGirls = -1;
        int numStudents = 0;

        double percentBoys= 0;
        double percentGirls= 0;

        //Ask how many boys are in class
        System.out.println("How many boys are in class?");
        do {
            //Check if the input is a number or not
            if (input.hasNextInt())
            {
                numBoys= input.nextInt();
                //If it's a number, check if it's a positive number
                if (numBoys < 0) {
                    //If it's not, ask again
                    System.out.println("That's not a valid number");
                }
            } else{
                //If it's not a number, ask again
                System.out.println("That's not a number");
            }
            //Clear input
            input.nextLine();
        } while(numBoys < 0);

        //Ask how many girls are in class
        System.out.println("How many girls are in class?");
        do {
            //Check if the input is a number or not
            if (input.hasNextInt())
            {
                numGirls= input.nextInt();
                //If it's a number, check if it's a positive number
                if (numGirls < 0) {
                    //If it's not, ask again
                    System.out.println("That's not a valid number");
                }
            } else{
                //If it's not a number, ask again
                System.out.println("That's not a number");
            }
            //Clear input
            input.nextLine();
        } while(numGirls < 0);

        //calculate the percentages
        numStudents = numBoys + numGirls;
        percentBoys = numBoys * 100.0f / numStudents;
        percentGirls = numBoys * 100.0f / numStudents;

        System.out.println("The percentage of boys is: " + percentBoys +"%");
        System.out.println("The percentage of girls is: " + percentGirls +"%");

    }
}