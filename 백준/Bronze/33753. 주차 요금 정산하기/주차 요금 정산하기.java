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
        int C = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(br.readLine());
        int fee = A;

        if (T > 30) {
            T -= 30;
            int over = T / B;

            // 나눠 떨어지지 않으면
            if (T % B > 0) {
                over++;
            }
            fee += over * C;
        }

        System.out.println(fee);
        br.close();
    }
}