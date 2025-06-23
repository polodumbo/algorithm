import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int C = Integer.parseInt(br.readLine());

        for (int i = 0; i < C; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            int sum = 0;
            for (int j = 0; j < N; j++) {
                int n = Integer.parseInt(st.nextToken());
                arr[j] = n;
                sum += n;
            }
            double avg = (double) sum / arr.length;

            int count = 0;
            for (int j = 0; j < N; j++) {
                if (arr[j] > avg) {
                    count++;
                }
            }
            double result = (double) count / arr.length * 100;
            sb.append(String.format("%.3f", result)).append('%').append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}