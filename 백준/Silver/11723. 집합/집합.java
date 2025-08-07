import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int num = 0;
            if (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }

            switch (str.charAt(0)) {
                case 'a':
                    if (str.equals("add")) {
                        set.add(num);
                    } else { // all
                        for (int j = 1; j <= 20; j++) {
                            set.add(j);
                        }
                    }
                    break;
                case 'r':
                    set.remove(num);
                    break;
                case 'c':
                    sb.append(set.contains(num) ? 1 : 0).append('\n');
                    break;
                case 't':
                    if (set.contains(num)) {
                        set.remove(num);
                    } else {
                        set.add(num);
                    }
                    break;
                case 'e':
                    set.clear();
                    break;
            }
        }

        System.out.println(sb);
        br.close();
    }
}