import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] strs = new String[N];
        for (int i = 0; i < N; i++) {
            strs[i] = br.readLine();
        }

        Arrays.sort(strs, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            } else {
                return a.length() - b.length();
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(strs[0]).append('\n');
        for (int i = 1; i < N; i++) {
            if (strs[i].equals(strs[i - 1])) continue;
            sb.append(strs[i]).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}