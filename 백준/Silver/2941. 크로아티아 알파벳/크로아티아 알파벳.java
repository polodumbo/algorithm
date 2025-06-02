import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (c == 'c' && i < len - 1) {
                if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
                    i++;
                }
            } else if (c == 'd' && i < len - 1) {
                if (str.charAt(i + 1) == '-') {
                    i++;
                } else if (str.charAt(i + 1) == 'z' && i < len - 2) {
                    if (str.charAt(i + 2) == '=') {
                        i += 2;
                    }
                }
            } else if ((c == 'l' || c == 'n') && i < len - 1) {
                if ((str.charAt(i + 1) == 'j')) {
                    i++;
                }
            } else if ((c == 's' || c == 'z') && i < len - 1) {
                if (str.charAt(i + 1) == '=') {
                    i++;
                }
            }
            count++;
        }

        System.out.println(count);
        br.close();
    }
}