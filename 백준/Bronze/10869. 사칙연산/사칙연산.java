import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        int a = 0, b = 0;
        input = sc.nextLine();
        String[] arInput = input.split(" ");
        a = Integer.parseInt(arInput[0]);
        b = Integer.parseInt(arInput[1]);

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}