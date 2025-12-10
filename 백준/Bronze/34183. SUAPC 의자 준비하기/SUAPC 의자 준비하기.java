import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 팀 수
        int M = Integer.parseInt(st.nextToken()); // 현재 의자 수
        int A = Integer.parseInt(st.nextToken()); // 의자 가격
        int B = Integer.parseInt(st.nextToken()); // 배송비

        int target = N * 3;
        int difference = target - M;
        int fee = 0;

        if (difference > 0) {
            fee = difference * A + B;
        }

        System.out.println(fee);
        br.close();
    }
}