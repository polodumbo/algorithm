import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        if (T % 10 == 0) {
            int t = 0;
            while (T >= 300) {
                T -= 300;
                t++;
            }
            sb.append(t).append(' ');

            t = 0;
            while (T >= 60) {
                T -= 60;
                t++;
            }
            sb.append(t).append(' ');

            t = 0;
            while (T >= 10) {
                T -= 10;
                t++;
            }
            sb.append(t);
        } else {
            sb.append(-1);
        }

        System.out.println(sb);
        br.close();
    }
}