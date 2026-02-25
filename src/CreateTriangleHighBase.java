public class CreateTriangleHighBase {
    public static void main(String[] args) {
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5 - r; c++) { // Loop for each column, decreasing with each row
                System.out.print("* "); // Print a star followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
