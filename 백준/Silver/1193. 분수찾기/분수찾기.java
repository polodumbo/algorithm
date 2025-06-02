import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int count = 1;
        int sum = 0;
        while (X > sum) {
            if (X > sum + count) {
                sum += count;
                count++;
            } else {
                if (count % 2 == 1) {
                    System.out.println((count + sum - X + 1) + "/" + (X - sum));
                } else {
                    System.out.println((X - sum) + "/" + (count + sum - X + 1));
                }
                break;
            }
        }

        br.close();
    }
}