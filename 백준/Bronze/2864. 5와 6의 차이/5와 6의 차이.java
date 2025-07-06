import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        int min = getChangedNum(a, 6, 5) + getChangedNum(b, 6, 5);
        int max = getChangedNum(a, 5, 6) + getChangedNum(b, 5, 6);

        System.out.println(min + " " + max);
        br.close();
    }

    static int getChangedNum(String num, int nBefore, int nAfter) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if (c - '0' == nBefore) {
                c = (char) (nAfter + '0');
            }
            sb.append(c);
        }
        return Integer.parseInt(sb.toString());
    }
}