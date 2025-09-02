import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] bingo;
    static int bingoCount;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bingo = new int[5][5];
        bingoCount = 0;

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        bingoLoop:
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int num = Integer.parseInt(st.nextToken());
                count++;

                checkNum(num);
                horizontal();
                vertical();
                upDiagonal();
                downDiagonal();

                if (bingoCount >= 3) {
                    break bingoLoop;
                }
                bingoCount = 0;
            }
        }

        System.out.println(count);
        br.close();
    }

    public static void checkNum(int num) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (bingo[i][j] == num) {
                    bingo[i][j] = -1;
                }
            }
        }
    }

    public static void horizontal() {
        for (int i = 0; i < 5; i++) {
            int count = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[i][j] == -1) {
                    count++;
                }
            }

            if (count == 5) {
                bingoCount++;
            }
        }
    }

    public static void vertical() {
        for (int i = 0; i < 5; i++) {
            int count = 0;
            for (int j = 0; j < 5; j++) {
                if (bingo[j][i] == -1) {
                    count++;
                }
            }

            if (count == 5) {
                bingoCount++;
            }
        }
    }

    public static void upDiagonal() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][4 - i] == -1) {
                count++;
            }

        }
        if (count == 5) {
            bingoCount++;
        }
    }

    public static void downDiagonal() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][i] == -1) {
                count++;
            }

        }
        if (count == 5) {
            bingoCount++;
        }
    }
}