import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = Integer.parseInt(st.nextToken());
		int diff = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();

		if ((sum + diff) % 2 == 0 && sum >= diff) {
			int scoreA = (sum + diff) / 2;
			int scoreB = sum - scoreA;

			sb.append(scoreA).append(' ').append(scoreB);
		} else {
			sb.append(-1);
		}

		System.out.println(sb);
		br.close();
	}
}