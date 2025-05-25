import java.util.Scanner;

public class BOJ2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), m = sc.nextInt(), t = sc.nextInt();

        h += t / 60;
        m += t % 60;

        if (m >= 60) {
            h++;
            m -= 60;
        }

        if (h >= 24) {
            h -= 24;
        }

        System.out.printf("%d %d", h, m);
    }
}