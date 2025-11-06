import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String k = br.readLine();

		if (k.length() <= 2) {
			System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
			return;
		}

		int diff = k.charAt(1) - k.charAt(0);

		for (int i = 2; i < k.length(); i++) {
			if (k.charAt(i) - k.charAt(i - 1) != diff) {
				System.out.println("흥칫뿡!! <(￣ ﹌ ￣)>");
				return;
			}
		}
		System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");

		br.close();
	}
}