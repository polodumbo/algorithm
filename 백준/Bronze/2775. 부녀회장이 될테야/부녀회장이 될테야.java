import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[][] aptArr = new int[15][15];

		for (int i = 0; i < 15; i++) {
			aptArr[i][1] = 1; // i층 1호
			aptArr[0][i] = i; // 0층 i호
		}

		for (int i = 1; i < 15; i++) { // 층
			for (int j = 2; j < 15; j++) { // 호
				aptArr[i][j] = aptArr[i][j - 1] + aptArr[i - 1][j];
			}
		}

		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sb.append(aptArr[k][n]).append('\n');
		}

		System.out.println(sb);
		br.close();
	}
}