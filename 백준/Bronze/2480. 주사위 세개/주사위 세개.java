import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int d1 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());
        int d3 = Integer.parseInt(st.nextToken());
        int prize = 0;
        int[] dices = {d1, d2, d3};

        if (d1 != d2 && d1 != d3 && d2 != d3) {
            prize = Arrays.stream(dices).max().getAsInt() * 100;
        } else if (d1 == d2 && d1 == d3) {
            prize = 10000 + d1 * 1000;
        } else if (d1 == d2 || d1 == d3) {
            prize = 1000 + d1 * 100;
        } else {
            prize = 1000 + d2 * 100;
        }

        System.out.println(prize);
        br.close();
    }
}