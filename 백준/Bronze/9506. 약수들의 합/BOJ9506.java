import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strbd = new StringBuilder();

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == -1) break;

            List<Integer> divisors = new ArrayList<>();
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    divisors.add(i);
                    sum += i;
                }
            }

            strbd.append(num);
            if (sum == num) {
                strbd.append(" = ");
                for (int i = 0; i < divisors.size(); i++) {
                    strbd.append(divisors.get(i) + " + ");
                }
                strbd.replace(strbd.length() - 3, strbd.length(), "");
            } else {
                strbd.append(" is NOT perfect.");
            }
            strbd.append("\n");
        }

        System.out.println(strbd);
        br.close();
    }
}