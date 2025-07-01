import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int second = 0;
        for (int i = 0; i < 4; i++) {
            second += Integer.parseInt(br.readLine());
        }

        StringBuilder sb = new StringBuilder();
        sb.append(second / 60).append('\n');
        second %= 60;
        sb.append(second);

        System.out.println(sb);
        br.close();
    }
}