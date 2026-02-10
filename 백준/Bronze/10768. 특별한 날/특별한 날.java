import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int SPECIAL_MONTH = 2;
        final int SPECIAL_DAY = 18;

        int month = Integer.parseInt(br.readLine());
        int day = Integer.parseInt(br.readLine());

        if (month < SPECIAL_MONTH) {
            System.out.println("Before");
        } else if (month > SPECIAL_MONTH) {
            System.out.println("After");
        } else {
            if (day < SPECIAL_DAY) {
                System.out.println("Before");
            } else if (day > SPECIAL_DAY) {
                System.out.println("After");
            } else {
                System.out.println("Special");
            }
        }

        br.close();
    }
}