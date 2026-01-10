import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); // 경쟁 가격
        int B = Integer.parseInt(st.nextToken()); // 경쟁 성능
        int C = Integer.parseInt(st.nextToken()); // WARBOY 가격
        int D = 0; // WARBOY 성능
        int E = B / A; // 경쟁 가성비

        // WARBOY 가성비는 경쟁사 3배
        // D / C = 3 * E
        D = 3 * E * C;

        System.out.println(D);
        br.close();
    }
}