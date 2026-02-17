import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            int a = 0;
            int b = 0;

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == 'a') {
                    a++;
                } else {
                    b++;
                }
            }

            sb.append(Math.min(a, b)).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}