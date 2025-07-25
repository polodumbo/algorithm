import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;
        // 한 자리 수가 될 때까지 각 자리 수 덧셈
        while (str.length() != 1) {
            int sum = 0;
            char[] chars = str.toCharArray();
            for (char c : chars) {
                sum += c - '0';
            }
            str = String.valueOf(sum);
            count++;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(count).append('\n');

        if (Integer.parseInt(str) % 3 == 0) {
            sb.append("YES");
        } else {
            sb.append("NO");
        }

        System.out.println(sb);
        br.close();
    }
}