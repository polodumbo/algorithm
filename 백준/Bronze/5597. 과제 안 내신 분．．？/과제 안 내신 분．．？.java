import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean[] students = new boolean[30];

        for (int i = 0; i < 28; i++) {
            students[Integer.parseInt(br.readLine()) - 1] = true;
        }

        for (int i = 0; i < 30; i++) {
            if (!students[i]) {
                sb.append(i + 1).append("\n");
            }
        }

        System.out.println(sb);
        br.close();
    }
}