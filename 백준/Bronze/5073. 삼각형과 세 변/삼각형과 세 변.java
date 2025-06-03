import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] lengths = new int[3];

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            lengths[0] = Integer.parseInt(st.nextToken());
            lengths[1] = Integer.parseInt(st.nextToken());
            lengths[2] = Integer.parseInt(st.nextToken());

            if (lengths[0] == 0 && lengths[1] == 0 && lengths[2] == 0) {
                break;
            }

            Arrays.sort(lengths);

            if (lengths[0] + lengths[1] <= lengths[2]) {
                System.out.println("Invalid");
            } else if (lengths[0] == lengths[1] && lengths[0] == lengths[2] && lengths[1] == lengths[2]) {
                System.out.println("Equilateral");
            } else if (lengths[0] != lengths[1] && lengths[0] != lengths[2] && lengths[1] != lengths[2]) {
                System.out.println("Scalene");
            } else {
                System.out.println("Isosceles");
            }
        }

        br.close();
    }
}