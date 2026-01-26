import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int ur = 56 * Integer.parseInt(st.nextToken());
        int tr = 24 * Integer.parseInt(st.nextToken());
        int uo = 14 * Integer.parseInt(st.nextToken());
        int to = 6 * Integer.parseInt(st.nextToken());
        int score = ur + tr + uo + to;

        System.out.println(score);
        br.close();
    }
}