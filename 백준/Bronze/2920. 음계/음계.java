import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            int n = Integer.parseInt(st.nextToken());
            arr[i] = n;
        }

        if (isAscending(arr)) {
            System.out.println("ascending");
        } else if (isDescending(arr)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

        br.close();
    }

    public static boolean isAscending(int[] arr) {
        for (int i = 0; i < 8; i++) {
            if (arr[i] != i + 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDescending(int[] arr) {
        for (int i = 0; i < 8; i++) {
            if (arr[i] != 8 - i) {
                return false;
            }
        }
        return true;
    }
}