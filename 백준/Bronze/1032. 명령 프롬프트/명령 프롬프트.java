import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }

        int length = str[0].length();
        char[] charArray = str[0].toCharArray();
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < length; j++) {
                if (str[i].charAt(j) != str[i + 1].charAt(j)) {
                    charArray[j] = '?';
                }
            }
        }

        System.out.println(String.valueOf(charArray));
        br.close();
    }
}