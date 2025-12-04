import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int anger = 0;
        long total = 0;

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) {
                anger--;
            } else {
                anger++;
            }
            total += anger;
        }

        System.out.println(total);
        br.close();
    }
}