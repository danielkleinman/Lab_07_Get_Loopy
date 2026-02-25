public class CreateTriangleLowBase {
    public static void main(String[] args) {
        for (int r = 0; r < 5; r++) { // Loop for each row
            for (int c = 0; c <= r; c++) { // Loop for each column, increasing with each row
                System.out.print("* "); // Print a star followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
