import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[][] board = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'B') {
                    board[i][j] = false;
                } else {
                    board[i][j] = true;
                }
            }
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                int count = 0;
                boolean f = board[i][j];
                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        if (board[k][l] != f) {
                            count++;
                        }
                        f = !f;
                    }
                    f = !f;
                }
                min = Math.min(min, Math.min(count, 64 - count));
            }
        }

        System.out.println(min);
        br.close();
    }
}