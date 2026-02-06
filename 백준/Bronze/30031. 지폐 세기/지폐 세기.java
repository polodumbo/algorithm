import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int total = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int width = Integer.parseInt(st.nextToken());
            int length = Integer.parseInt(st.nextToken());

            total += sortMoney(width, length);
        }

        System.out.println(total);
        br.close();
    }

    static int sortMoney(int width, int length) {
        if (length != 68) {
            return 0;
        }

        int result = 0;

        switch (width) {
            case 136:
                result = 1000;
                break;
            case 142:
                result = 5000;
                break;
            case 148:
                result = 10000;
                break;
            case 154:
                result = 50000;
                break;
        }

        return result;
    }
}