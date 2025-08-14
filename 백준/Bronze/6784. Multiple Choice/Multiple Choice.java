import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] correctAnswers = new char[N];

        for (int i = 0; i < N; i++) {
            char C = br.readLine().charAt(0);
            correctAnswers[i] = C;
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            char A = br.readLine().charAt(0);
            if (A == correctAnswers[i]) {
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }
}