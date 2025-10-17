import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            nList.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(nList);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int m = Integer.parseInt(st.nextToken());
            int result = Collections.binarySearch(nList, m);

            if (result > -1) {
                sb.append(1);
            } else {
                sb.append(0);
            }
            sb.append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}