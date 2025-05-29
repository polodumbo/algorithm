import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] balls = new int[N];

        for (int i = 0; i < balls.length; i++) {
            balls[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());

            while (I < J) {
                int temp = balls[I - 1];
                balls[I - 1] = balls[J - 1];
                balls[J - 1] = temp;

                I++;
                J--;
            }
        }

        for (int b : balls) {
            sb.append(b).append(" ");
        }

        System.out.println(sb);
        br.close();
    }
}