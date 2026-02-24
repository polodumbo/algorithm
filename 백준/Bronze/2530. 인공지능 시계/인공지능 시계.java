import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int cookingTime = Integer.parseInt(br.readLine());

        s += cookingTime % 60;
        if (s >= 60) {
            m += s / 60;
            s %= 60;
        }

        m += cookingTime / 60;
        if (m >= 60) {
            h += m / 60;
            m %= 60;
        }

        if (h >= 24) {
            h %= 24;
        }

        System.out.println(h + " " + m + " " + s);
        br.close();
    }
}