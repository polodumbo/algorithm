import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        char game = st.nextToken().charAt(0);

        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        int playable = 0;
        switch (game) {
            case 'Y':
                playable = set.size();
                break;
            case 'F':
                playable = set.size() / 2;
                break;
            case 'O':
                playable = set.size() / 3;
                break;
        }

        System.out.println(playable);
        br.close();
    }

}