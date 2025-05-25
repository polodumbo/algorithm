import java.util.Scanner;

public class BOJ2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] whites = new boolean[100][100];
        int paperCount = sc.nextInt();
        int area = 0;

        for (int i = 0; i < paperCount; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!whites[j][k]) {
                        whites[j][k] = true;
                        area++;
                    }
                }
            }
        }

        System.out.println(area);
    }
}