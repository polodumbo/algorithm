import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[sc.nextInt()];
        double max = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();

            if (max < nums[i]) {
                max = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] / max * 100;
        }

        System.out.println(sum / nums.length);
    }
}