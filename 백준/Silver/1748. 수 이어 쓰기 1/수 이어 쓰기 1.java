import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int digit = 1;
        int till = 10;
        int length = 0;
        for (int i = 1; i <= N; i++) {
            if (i % till == 0) {
                digit++;
                till *= 10;
            }
            length += digit;
        }
        System.out.println(length);
        br.close();
    }
}