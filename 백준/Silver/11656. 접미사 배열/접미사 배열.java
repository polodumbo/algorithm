import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            list.add(S.substring(i));
        }
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}