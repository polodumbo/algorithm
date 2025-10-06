import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        int countZero = S.charAt(0) == '1' ? 1 : 0;
        int countOne = S.charAt(0) == '0' ? 1 : 0;

        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                if (S.charAt(i + 1) == '0') {
                    countOne++;
                } else {
                    countZero++;
                }
            }
        }

        System.out.println(Math.min(countZero, countOne));
        br.close();
    }
}