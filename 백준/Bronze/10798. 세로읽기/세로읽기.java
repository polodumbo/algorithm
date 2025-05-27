import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] cs = new char[5][15];
        int max = 0;

        for (int i = 0; i < cs.length; i++) {
            String str = sc.next();

            if (str.length() > max) {
                max = str.length();
            }

            for (int j = 0; j < str.length(); j++) {
                cs[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < cs.length; j++) {
                if (cs[j][i] == '\0') {
                    continue;
                }
                System.out.print(cs[j][i]);
            }
        }
    }
}