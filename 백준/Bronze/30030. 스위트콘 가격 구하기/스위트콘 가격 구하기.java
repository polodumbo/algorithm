import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int priceWithTax = Integer.parseInt(br.readLine());
        int price = priceWithTax / 11 * 10;

        System.out.println(price);
        br.close();
    }
}