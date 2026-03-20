import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        // A ~ B
        // K +- X

        int count = 0;
        for (int i = K - X; i < K + X + 1; i++) {
            if (i >= A && i <= B) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(count);
        }
        br.close();
    }
}