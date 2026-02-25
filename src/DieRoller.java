import java.util.Random;
public class DieRoller {
    public static void main(String[] args) {

        Random gen = new Random();

        //Define variables
        int die1 = 0;
        int die2 = 1;
        int die3 = 2;

        System.out.println("Rolling 3 dice until we get a triple...");

        for (int c = 0; die1 != die2 || die2 != die3; c++)
        {
            if(c % 10 == 0){ //Add a header every 10 rolls
                System.out.println("Roll   Die1   Die2   Die3");
            }

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
