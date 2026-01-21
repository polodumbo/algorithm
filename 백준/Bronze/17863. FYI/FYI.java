import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] chars = br.readLine().toCharArray();
        boolean isPassed = true;
        for (int i = 0; i < 3; i++) {
            if (chars[i] != '5') {
                isPassed = false;
                break;
            }
        }

        System.out.println(isPassed ? "YES" : "NO");
        br.close();
    }
}