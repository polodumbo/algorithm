import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] nums = new int[26];
        char c = ' ';

        for (int i = 0; i < S.length(); i++) {
            c = S.charAt(i);
            if (c >= 65 && c <= 90) {
                nums[c - 'A']++;
            } else {
                nums[c - 'a']++;
            }
        }

        int max = -1;

        for (int i = 0; i < 26; i++) {
            if (nums[i] > max) {
                max = nums[i];
                c = (char) (i + 65);
            } else if (nums[i] == max) {
                c = '?';
            }
        }

        System.out.println(c);

    }
}