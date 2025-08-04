import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int scenario = 1;
        int n;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            String[] students = new String[n];
            for (int i = 0; i < n; i++) {
                students[i] = br.readLine();
            }

            boolean[] isFound = new boolean[n];
            for (int i = 0; i < 2 * n - 1; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int idx = Integer.parseInt(st.nextToken()) - 1;
                isFound[idx] = !isFound[idx];
            }

            sb.append(scenario++).append(' ');
            for (int i = 0; i < isFound.length; i++) {
                if (isFound[i]) {
                    sb.append(students[i]).append('\n');
                    break;
                }
            }
        }

        System.out.println(sb);
        br.close();
    }
}