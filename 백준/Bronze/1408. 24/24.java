import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int s1 = 0;
        s1 += Integer.parseInt(st.nextToken()) * 3600;
        s1 += Integer.parseInt(st.nextToken()) * 60;
        s1 += Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), ":");
        int s2 = 0;
        s2 += Integer.parseInt(st.nextToken()) * 3600;
        s2 += Integer.parseInt(st.nextToken()) * 60;
        s2 += Integer.parseInt(st.nextToken());

        int t = s2 - s1;
        if (s2 <= s1) {
            t += 24 * 3600;
        }

        int h = t / 3600;
        int m = t / 60 % 60;
        int s = t % 60;

        System.out.printf("%02d:%02d:%02d", h, m, s);
        br.close();
    }
}