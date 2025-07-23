import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] paintArr = new int[101][101]; // 100 * 100 종이
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 몇 번 수행
        int M = Integer.parseInt(st.nextToken()); // 투명도


        for (int i = 0; i < N; i++) {
            // 가리는 종이의 크기
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int j = y1; j <= y2; j++) {
                for (int k = x1; k <= x2; k++) {
                    paintArr[j][k]++;
                }
            }
        }

        int count = 0;
        for (int[] paints : paintArr) {
            for (int paint : paints) {
                if (paint > M) {
                    count++;
                }
            }
        }

        System.out.println(count);
        br.close();
    }
}