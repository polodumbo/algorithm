import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int first = Integer.parseInt(br.readLine());
        int min = first;
        int max = first;

        for (int i = 0; i < N - 1; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x < min) {
                min = x;
            }
            if (x > max) {
                max = x;
            }
        }

        if (min == first) {
            System.out.println("ez");
        } else if (max == first) {
            System.out.println("hard");
        } else {
            System.out.println("?");
        }
        br.close();
    }
}