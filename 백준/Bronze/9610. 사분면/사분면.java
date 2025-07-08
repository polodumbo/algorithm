import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (x == 0 || y == 0) {
                arr[4]++;
                continue;
            }

            if (x > 0 && y > 0) {
                arr[0]++;
            } else if (x < 0 && y > 0) {
                arr[1]++;
            } else if (x < 0 && y < 0) {
                arr[2]++;
            } else if (x > 0 && y < 0) {
                arr[3]++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append('Q').append(i + 1).append(": ").append(arr[i]).append('\n');
        }
        sb.append("AXIS: ").append(arr[4]);

        System.out.println(sb);
        br.close();
    }
}