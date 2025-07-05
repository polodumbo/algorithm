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
        int K = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String S = st.nextToken();
            String Y = st.nextToken();
            map.put(S + Y, map.getOrDefault(S + Y, 0) + 1);
        }

        int room = 0;
        for (Integer value : map.values()) {
            room += value / K;
            if (value % K > 0) {
                room++;
            }
        }

        System.out.println(room);
        br.close();
    }
}