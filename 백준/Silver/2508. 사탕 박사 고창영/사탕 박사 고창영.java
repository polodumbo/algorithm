import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            char[][] chars = new char[r][c];
            for (int j = 0; j < r; j++) {
                chars[j] = br.readLine().toCharArray();
            }

            int count = 0;
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c - 2; k++) {
                    if (chars[j][k] != '>') { // 아래 생략
                        continue;
                    }
                    if (chars[j][k + 1] == 'o' && chars[j][k + 2] == '<') {
                        count++;
                    }
                }
            }

            for (int j = 0; j < c; j++) {
                for (int k = 0; k < r - 2; k++) {
                    if (chars[k][j] != 'v') {
                        continue;
                    }
                    if (chars[k + 1][j] == 'o' && chars[k + 2][j] == '^') {
                        count++;
                    }
                }
            }

            sb.append(count).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}