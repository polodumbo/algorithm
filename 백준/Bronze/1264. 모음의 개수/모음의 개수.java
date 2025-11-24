import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine().toLowerCase();
            if (str.length() == 1 && str.charAt(0) == '#') {
                break;
            }

            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                switch (c) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        count++;
                }
            }

            sb.append(count).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}