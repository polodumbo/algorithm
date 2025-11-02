import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 10; i < 100; i++) {
			String s = String.valueOf(i);
			if (s.contains("8")) {
				continue;
			}

			int reversed = Integer.parseInt(new StringBuilder(s).reverse().toString());
			int digitSum = i / 10 + i % 10;
			if (reversed % 4 == 0 && digitSum % 6 == 0) {
				System.out.println(i);
				break;
			}
		}

		br.close();
	}
}