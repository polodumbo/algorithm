import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[][] nums = new int[9][9];
        int max = Integer.MIN_VALUE;
        int n = 0, m = 0;

        for (int i = 0; i < nums.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < nums[0].length; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num > max) {
                    max = num;
                    n = i;
                    m = j;
                }
            }
        }
        sb.append(max).append("\n").append(n + 1).append(" ").append(m + 1);

        System.out.println(sb);
        br.close();
    }
}