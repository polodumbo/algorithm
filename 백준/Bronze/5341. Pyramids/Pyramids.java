import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) {
                break;
            }

            int result = (n + 1) * (n / 2) + (n % 2) * ((n + 1) / 2);
            sb.append(result).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}