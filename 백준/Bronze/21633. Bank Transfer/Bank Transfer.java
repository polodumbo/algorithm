import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double k = Double.parseDouble(br.readLine());
        double charge = k * 0.01 + 25;
        charge = charge < 100 ? 100 : charge;
        charge = charge > 2000 ? 2000 : charge;

        System.out.printf("%.2f%n", charge);
        br.close();
    }
}