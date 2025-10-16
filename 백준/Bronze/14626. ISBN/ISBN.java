import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int sum = str.charAt(12) - '0'; // m
        int index = -1;
        for (int i = 0; i < 12; i++) {
            if (str.charAt(i) == '*') {
                index = i;
                continue;
            }

            int n = str.charAt(i) - '0';

            if (i % 2 == 0) {
                sum += n;
            } else {
                sum += n * 3;
            }
        }

        int number = 10 - sum % 10;
        if (index % 2 != 0) {
            for (int i = 0; i < 10; i++) {
                if ((i * 3 + sum) % 10 == 0) {
                    number = i;
                }
            }
        }

        System.out.println(number);
        br.close();
    }
}