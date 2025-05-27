import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int temp = b;

        for (int i = 0; i < 3; i++) {
            System.out.println(a * (temp % 10));
            temp /= 10;
        }

        System.out.println(a * b);
        br.close();
    }
}