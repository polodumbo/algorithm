import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        Map<Character, Character> mirrorMap = new HashMap<>();

        mirrorMap.put('b', 'd');
        mirrorMap.put('d', 'b');
        mirrorMap.put('p', 'q');
        mirrorMap.put('q', 'p');
        mirrorMap.put('i', 'i');
        mirrorMap.put('o', 'o');
        mirrorMap.put('v', 'v');
        mirrorMap.put('w', 'w');
        mirrorMap.put('x', 'x');

        Set<Character> characterSet = mirrorMap.keySet();

        while (true) {
            boolean isPassed = true;
            String str = br.readLine();

            if (str.length() == 1 && str.charAt(0) == '#') {
                break;
            }

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (!characterSet.contains(c)) {
                    sb.append("INVALID");
                    isPassed = false;
                    break;
                }
            }

            if (isPassed) {
                for (int i = str.length() - 1; i >= 0; i--) {
                    char c = str.charAt(i);
                    sb.append(mirrorMap.get(c));
                }
            }

            sb.append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}