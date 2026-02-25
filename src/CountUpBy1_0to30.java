public class CountUpBy1_0to30 {
    public static void main(String[] args) {
        for(int i = 0; i <= 30; i++) // Loop from 0 to 30
        {
            String end = "";
            if (i < 30) {end = ", ";} // Don't add a comma after the last number
            System.out.print(i + end);
        }
    }
}
