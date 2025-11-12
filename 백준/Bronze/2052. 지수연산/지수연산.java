import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		double a = Math.pow(0.5, N);

		BigDecimal bd = new BigDecimal(a);
		bd = bd.setScale(N, RoundingMode.HALF_UP);

		System.out.println(bd.toPlainString());
		br.close();
	}
}