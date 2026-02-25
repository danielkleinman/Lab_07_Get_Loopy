public class CreateSquareFigure {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // Loop for each row
            for (int j = 0; j < 5; j++) { // Loop for each column
                System.out.print("* "); // Print a star followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
