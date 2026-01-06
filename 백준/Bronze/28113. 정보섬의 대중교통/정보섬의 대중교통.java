import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 지하철까지
        int A = Integer.parseInt(st.nextToken()); // 버스
        int B = Integer.parseInt(st.nextToken()); // 지하철

        if (N <= B && B == A) {
            System.out.println("Anything");
        } else if (N <= B && B - A > 0) {
            System.out.println("Bus");
        } else {
            System.out.println("Subway");
        }
        br.close();
    }
}