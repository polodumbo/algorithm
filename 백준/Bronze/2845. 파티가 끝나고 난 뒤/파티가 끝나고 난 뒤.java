import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int l = L * P;

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(st.nextToken());
            sb.append(n - l).append(' ');
        }

        System.out.println(sb);
        br.close();
    }
}