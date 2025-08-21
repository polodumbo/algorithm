import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int score = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        if (N > 0) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
        }

        if (N == P && list.get(list.size() - 1) >= score) {
            System.out.println(-1);
        } else {
            list.add(score);
            Collections.sort(list);
            Collections.reverse(list);

            int grade = 1;
            int count = 0;
            while (count <= P) {
                int n = list.get(count++);
                if (n == score) {
                    System.out.println(grade);
                    break;
                } else {
                    grade++;
                }
            }
        }

        br.close();
    }
}