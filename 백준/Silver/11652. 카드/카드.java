import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            long n = Long.parseLong(br.readLine());
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        long num = 0L;
        int max = 0;
        for (Entry<Long, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                num = entry.getKey();
            } else if (entry.getValue() == max) {
                num = Math.min(num, entry.getKey());
            }
        }

        System.out.println(num);
        br.close();
    }
}