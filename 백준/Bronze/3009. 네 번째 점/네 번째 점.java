import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] xs = new int[3];
        int[] ys = new int[3];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            xs[i] = x;
            ys[i] = y;
        }

        sb.append(pickOne(xs)).append(" ").append(pickOne(ys));
        System.out.println(sb);
        br.close();
    }

    static int pickOne(int[] nums) {
        int result = 0;
        if (nums[0] == nums[1]) {
            result = nums[2];
        } else if (nums[0] == nums[2]) {
            result = nums[1];
        } else {
            result = nums[0];
        }

        return result;
    }
}