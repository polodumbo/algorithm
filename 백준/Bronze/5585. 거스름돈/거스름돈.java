import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int price = 0;
	static int money = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		price = Integer.parseInt(br.readLine());
		money = 1000 - price;
		int change = 0;
		
		change += cal(500);
		change += cal(100);
		change += cal(50);
		change += cal(10);
		change += cal(5);
		change += money;

		System.out.println(change);
		br.close();
	}

	public static int cal(int unit) {
		int count = money / unit;
		money %= unit;
		return count;
	}
}