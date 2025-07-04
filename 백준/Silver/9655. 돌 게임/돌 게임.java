import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 1 > 상근1
        // 2 > 상근1 창영1
        // 3 > 상근3
        // 4 > 상근1 창영3 or 상근3 창영1
        // 5 > 상근1 창영3 상근1
        // 6 > 상근1 창영3 상근1 창영1
        if (N % 2 == 1) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }
        br.close();
    }
}