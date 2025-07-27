import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int nA = Integer.parseInt(st.nextToken());
        int nB = Integer.parseInt(st.nextToken());

        StringTokenizer stA = new StringTokenizer(br.readLine());
        StringTokenizer stB = new StringTokenizer(br.readLine());

        TreeSet<Integer> A = new TreeSet<>();
        for (int i = 0; i < nA; i++) {
            A.add(Integer.parseInt(stA.nextToken()));
        }
        for (int i = 0; i < nB; i++) {
            int b = Integer.parseInt(stB.nextToken());
            // contains 검사가 필요 없다고 한다.
            if (A.contains(b)) {
                A.remove(b);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(A.size()).append('\n');
        for (int a : A) {
            sb.append(a).append(' ');
        }

        System.out.println(sb);
        br.close();
    }
}