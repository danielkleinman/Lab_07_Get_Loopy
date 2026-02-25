public class CountUpBy3_0to18 {
    public static void main(String[] args) {
        for(int i = 0; i <= 18; i+=3) // Loop from 0 to 18
        {
            String end = "";
            if (i < 18) {end = ", ";} // Don't add a comma after the last number
            System.out.print(i + end);
        }
    }
}
