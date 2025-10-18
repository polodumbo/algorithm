import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int K = Integer.parseInt(br.readLine());
        for (int i = 0; i < K; i++) {
            int h = Integer.parseInt(br.readLine());
            String str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == 'c') {
                    h++;
                } else {
                    h--;
                }
            }
            sb.append("Data Set ").append(i + 1).append(":\n");
            sb.append(h).append("\n\n");
        }

        System.out.println(sb);
        br.close();
    }
}