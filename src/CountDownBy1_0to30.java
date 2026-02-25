public class CountDownBy1_0to30 {
    static void main(String[] args) {
        for(int i = 30; i >= 0; i--) // Loop from 30 to 0
        {
            String end = "";
            if (i > 0) {end = ", ";} // Don't add a comma after the last number
            System.out.print(i + end);
        }
    }
}