import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] nums = new int[26];
        char c = ' ';

        for (int i = 0; i < 26; i++) {
            nums[i] = -1;
        }

        for (int i = 0; i < S.length(); i++) {
            c = S.charAt(i);
            if (nums[c - 'a'] == -1) {
                nums[c - 'a'] = i;
            }
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}