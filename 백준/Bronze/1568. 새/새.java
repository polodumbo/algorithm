import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int n = 1;
        while (N != 0) {
            if (N < n) {
                n = 1;
            }
            N -= n;
            count++;
            n++;
        }

        System.out.println(count);
        br.close();
    }
}