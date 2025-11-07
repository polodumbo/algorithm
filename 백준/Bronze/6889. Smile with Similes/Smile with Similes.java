import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		String[] adjectives = new String[n];
		String[] nouns = new String[m];

		for (int i = 0; i < n; i++) {
			adjectives[i] = br.readLine();
		}

		for (int i = 0; i < m; i++) {
			nouns[i] = br.readLine();
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				sb.append(adjectives[i]).append(" as ").append(nouns[j]).append('\n');
			}
		}

		System.out.println(sb);
		br.close();
	}
}