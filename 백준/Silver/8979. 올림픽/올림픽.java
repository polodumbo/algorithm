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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Medal> medalList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            medalList.add(new Medal(
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken())
            ));
        }

        Collections.sort(medalList, (m1, m2) -> {
            if (m1.gold == m2.gold) {
                if (m1.silver == m2.silver) {
                    return m2.bronze - m1.bronze;
                } else {
                    return m2.silver - m1.silver;
                }
            } else {
                return m2.gold - m1.gold;
            }
        });

        int rank = 0;
        for (int i = 1; i < N; i++) {
            Medal preMedal = medalList.get(i - 1);
            Medal nowMedal = medalList.get(i);

            if (preMedal.gold == nowMedal.gold
                && preMedal.silver == nowMedal.silver
                && preMedal.bronze == nowMedal.bronze) {

                nowMedal.rank = preMedal.rank;
            } else {
                nowMedal.rank = i + 1;
            }

            if (nowMedal.country == K) {
                rank = nowMedal.rank;
                break;
            }
        }

        System.out.println(rank);
        br.close();
    }

    public static class Medal {

        int country;
        int gold;
        int silver;
        int bronze;
        int rank;

        public Medal(int country, int gold, int silver, int bronze) {
            this.country = country;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
            this.rank = 1;
        }
    }
}