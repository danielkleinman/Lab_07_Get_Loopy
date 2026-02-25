public class CountDownBy2_10to0 {
    static void main(String[] args) {
        for(int i = 10; i >= 0; i-=2) // Loop from 30 to 0
        {
            String end = "";
            if (i > 0) {end = ", ";} // Don't add a comma after the last number
            System.out.print(i + end);
        }
    }
}
