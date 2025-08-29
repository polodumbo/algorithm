import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        T = Integer.parseInt(br.readLine());

        int first = getCost(a, 30, x);
        int second = getCost(b, 45, y);

        System.out.println(first + " " + second);
        br.close();
    }

    public static int getCost(int monthlyFee, int freeTime, int costPerMin) {
        if (T - freeTime <= 0) {
            return monthlyFee;
        }
        return monthlyFee + (T - freeTime) * costPerMin * 21;
    }
}