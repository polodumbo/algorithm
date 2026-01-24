import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        boolean[] nums = new boolean[201];
        int last = -1;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(br.readLine());
            nums[num] = true;

            if (i == n) {
                last = num;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= last; i++) {
            if (!nums[i]) {
                sb.append(i).append('\n');
            }
        }

        if (sb.length() == 0) {
            sb.append("good job");
        }

        System.out.println(sb);
        br.close();
    }
}