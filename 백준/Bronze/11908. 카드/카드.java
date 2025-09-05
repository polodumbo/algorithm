import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer> cardList = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cardList.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(cardList);
        cardList.remove(cardList.size() - 1);

        int total = 0;
        for (int i : cardList) {
            total += i;
        }

        System.out.println(total);
        br.close();
    }
}