import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for (int i = 0; i < N - 1; i++) {
            String str = br.readLine();
            int n = map.get(str);
            if (n == 1) {
                map.remove(str);
            } else {
                map.put(str, n - 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String s : map.keySet()) {
            sb.append(s).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}