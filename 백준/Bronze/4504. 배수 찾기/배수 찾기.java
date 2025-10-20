import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                break;
            }

            if (num % n == 0) {
                sb.append(num).append(" is a multiple of ").append(n).append(".\n");
            } else {
                sb.append(num).append(" is NOT a multiple of ").append(n).append(".\n");
            }
        }

        System.out.println(sb);
        br.close();
    }
}