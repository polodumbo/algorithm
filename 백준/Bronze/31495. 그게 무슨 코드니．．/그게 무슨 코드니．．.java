import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();

        if (S.charAt(0) == '"' &&
            S.charAt(S.length() - 1) == '"' &&
            S.length() > 2) {

            sb.append(S, 1, S.length() - 1);
        } else {
            sb.append("CE");
        }

        System.out.println(sb);
        br.close();
    }
}