import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int dot = 2;
        for (int i = 1; i <= N; i++) {
            dot = dot + dot - 1;
        }
        dot = (int) Math.pow(dot, 2);

        System.out.println(dot);
        br.close();
    }
}