import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<Integer, String> numNameMap = new HashMap<>();
        Map<String, Integer> nameNumMap = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String s = br.readLine();
            numNameMap.put(i, s);
            nameNumMap.put(s, i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            if (Character.isDigit(s.charAt(0))) {
                sb.append(numNameMap.get(Integer.parseInt(s)));
            } else {
                sb.append(nameNumMap.get(s));
            }
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}