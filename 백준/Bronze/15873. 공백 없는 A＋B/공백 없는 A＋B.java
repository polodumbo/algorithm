import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int a = 0;
        int b = 0;

        if (str.length() == 2) {
            a = Integer.parseInt(str.substring(0, 1));
            b = Integer.parseInt(str.substring(1, 2));
        } else if (str.length() == 3) {
            if (str.charAt(1) == '0') {
                a = Integer.parseInt(str.substring(0, 2));
                b = Integer.parseInt(str.substring(2, 3));
            } else {
                a = Integer.parseInt(str.substring(0, 1));
                b = Integer.parseInt(str.substring(1, 3));
            }
        } else {
            a = 10;
            b = 10;
        }

        System.out.println(a + b);
        br.close();
    }
}