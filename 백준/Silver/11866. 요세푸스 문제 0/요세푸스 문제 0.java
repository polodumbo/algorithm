import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {

            list.add(i);
        }

        int idx = 0;
        sb.append("<");
        while (list.size() > 1) {
            idx = (idx + K - 1) % list.size();
            sb.append(list.get(idx)).append(", ");
            list.remove(idx);
        }
        sb.append(list.get(0)).append(">");
        
        System.out.println(sb);
        br.close();
    }
}