import java.util.Random;
import java.util.Scanner;
public class DieRollerUserInput {
    public static void main(String[] args) {

        Random gen = new Random();
        Scanner in = new Scanner(System.in);

        //Define variables
        int die1 = 0;
        int die2 = 1;
        int die3 = 2;

        System.out.println("Rolling 3 dice until we get a triple...");
        System.out.println("Roll   Die1   Die2   Die3");

        for (int c = 0; die1 != die2 || die2 != die3; c++)
        {
            do{//Ask the user if they want to continue after every roll to be particularly annoying :)
                System.out.print("Would you like to continue? (Y/N): ");
                String input = in.nextLine().trim().toUpperCase();
                if(input.equals("Y")){
                    break; // Continue with the next roll
                }
                else if(input.equals("N")){
                    System.out.println("Exiting the program. Goodbye!");
                    return; // Exit the program
                }
                else{
                    System.out.println("Invalid input. Please enter 'Y' or 'N'.");
                }
            }while(true); // Loop until valid input is received
            //Generate random numbers between 1 and 6 for each die
            die1 = gen.nextInt(6) + 1;
            die2 = gen.nextInt(6) + 1;
            die3 = gen.nextInt(6) + 1;

            if(die1 != die2 || die2 != die3) {//If the dice don't match, print the current roll and values
                System.out.printf("%03d    %d      %d      %d\n", c, die1, die2, die3);
            }
            else{//If the dice match, print a message and the final roll and values
                System.out.println("The three dice match! It took " + c + " rolls.");
                System.out.printf("%03d    %d      %d      %d\n", c, die1, die2, die3);
            }


        }
    }
}
