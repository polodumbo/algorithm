import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] alphaArr = new int[26];
        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            char c = name.charAt(0);
            alphaArr[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alphaArr.length; i++) {
            int i1 = alphaArr[i];
            if (i1 >= 5) {
                sb.append((char) (i + 'a'));
            }
        }
        if (sb.length() == 0) {
            sb.append("PREDAJA");
        }

        System.out.println(sb);
        br.close();
    }
}