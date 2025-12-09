import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        boolean[][] footprints = new boolean[L * 2 + 1][L * 2 + 1];
        footprints[L][L] = true;
        int x = L;
        int y = L;

        String order = br.readLine();
        int count = 1;

        for (int i = 0; i < L; i++) {
            char step = order.charAt(i);

            switch (step) {
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                case 'S':
                    y--;
                    break;
                case 'N':
                    y++;
                    break;
            }

            if (!footprints[x][y]) {
                footprints[x][y] = true;
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }
}