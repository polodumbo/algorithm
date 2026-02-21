import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = 300;

        for (int i = 0; i < 4; i++) {
            int time = Integer.parseInt(br.readLine());
            total += time;
        }

        if (total <= 1800) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        br.close();
    }
}