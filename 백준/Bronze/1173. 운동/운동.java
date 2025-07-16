import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        int time = 0;
        if (M - m < T) {
            time = -1;
        } else {
            int pulse = m;

            while (N != 0) {
                // 운동
                if (pulse + T <= M) {
                    pulse += T;
                    N--;
                } else {
                    pulse -= R;
                }

                // 휴식
                if (pulse < m) {
                    pulse = m;
                }

                time++;
            }
        }

        System.out.println(time);
        br.close();
    }
}