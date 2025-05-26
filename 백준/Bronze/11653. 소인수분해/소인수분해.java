import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        List<Integer> factorList = new ArrayList<>();

        for (int i = 2; i <= num; i++) {
            while (true) {
                if (num % i != 0) {
                    break;
                } else {
                    num /= i;
                    factorList.add(i);
                }
            }
        }

        for (Integer i : factorList) {
            System.out.println(i);
        }

        br.close();
    }
}