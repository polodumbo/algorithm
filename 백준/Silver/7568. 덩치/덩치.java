import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[][] personArr = new int[N][2];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			personArr[i][0] = Integer.parseInt(st.nextToken()); // weight
			personArr[i][1] = Integer.parseInt(st.nextToken()); // height
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			int rank = 1;

			for (int j = 0; j < N; j++) {
				if (i == j) {
					continue;
				}

				if (personArr[i][0] < personArr[j][0] && personArr[i][1] < personArr[j][1]) {
					rank++;
				}
			}

			sb.append(rank).append(' ');
		}

		System.out.println(sb);
		br.close();
	}
}