import java.util.Scanner;

public class BOJ2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[9];
        int max = 0, index = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        System.out.printf("%d\n%d", max, index + 1);
    }
}