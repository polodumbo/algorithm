import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T != 0) {
            Map<String, Double> map = new LinkedHashMap<>(); // HashMap은 순서 보장 X
            double max = 0.0;

            for (int i = 0; i < T; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                double height = Double.parseDouble(st.nextToken());

                if (max < height) {
                    max = height;
                }

                map.put(name, height);
            }

            for (Entry<String, Double> e : map.entrySet()) {
                if (e.getValue() == max) {
                    sb.append(e.getKey()).append(' ');
                }
            }
            sb.append('\n');

            T = Integer.parseInt(br.readLine());
        }

        System.out.println(sb);
        br.close();
    }
}