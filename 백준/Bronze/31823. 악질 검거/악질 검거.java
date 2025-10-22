import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<Integer> numSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int maxCount = 0;
            int count = 0;
            char pre = st.nextToken().charAt(0);

            if (pre == '.') {
                maxCount = 1;
                count = 1;
            }

            for (int j = 1; j < M; j++) {
                char now = st.nextToken().charAt(0);
                if (now == '.') {
                    count++;
                } else {
                    count = 0;
                }

                if (count > maxCount) {
                    maxCount = count;
                }
            }

            numSet.add(maxCount);
            sb.append(maxCount).append(' ').append(st.nextToken()).append('\n');
        }
        sb.insert(0, '\n')
            .insert(0, ' ')
            .insert(0, numSet.size());

        System.out.println(sb);
        br.close();
    }
}