import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer strtk = new StringTokenizer(br.readLine(), " ");

        int num1 = Integer.parseInt(strtk.nextToken());
        int num2 = Integer.parseInt(strtk.nextToken());
        int count = 0, result = 0;

        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                count++;
            }

            if (count == num2) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}