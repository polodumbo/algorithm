import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int days = Math.max(getDay(A, C), getDay(B, D));

        System.out.println(L - days);
        br.close();
    }

    static int getDay(int page, int spd) {
        int n = page / spd;
        if (page % spd > 0) {
            n++;
        }

        return n;
    }
}