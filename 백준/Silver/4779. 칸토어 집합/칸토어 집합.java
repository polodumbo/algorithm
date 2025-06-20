import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = br.readLine()) != null) {
            sb = new StringBuilder();
            int N = Integer.parseInt(str);
            int l = (int) Math.pow(3, N);
            for (int i = 0; i < l; i++) {
                sb.append("-");
            }

            setHyphen(0, l);
            System.out.println(sb);
        }
        br.close();
    }

    public static void setHyphen(int s, int l) {
        if (l == 1) return;
        int n = l / 3;

        for (int i = s + n; i < s + 2 * n; i++) {
            sb.setCharAt(i, ' ');
        }

        setHyphen(s, n);
        setHyphen(s + 2 * n, n);
    }
}