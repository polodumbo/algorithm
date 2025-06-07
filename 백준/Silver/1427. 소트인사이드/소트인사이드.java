import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        ArrayList<Integer> numList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            numList.add((int) c - '0');
        }
        Collections.sort(numList);
        Collections.reverse(numList);
        for (int i : numList) {
            sb.append(i);
        }

        System.out.println(sb);
        br.close();
    }
}