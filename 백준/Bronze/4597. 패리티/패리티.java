import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        while (!str.equals("#")) {
            int count = 0;
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == '1') {
                    count++;
                }
            }

            String s = str.substring(0, str.length() - 1);
            char c = str.charAt(str.length() - 1);
            if (c == 'e' && count % 2 == 0 || c == 'o' && count % 2 == 1) {
                sb.append(s).append(0);
            } else {
                sb.append(s).append(1);
            }
            sb.append('\n');

            str = br.readLine();
        }

        System.out.println(sb);
        br.close();
    }
}