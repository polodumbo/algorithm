import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] sciences = new int[4];
        int[] socials = new int[2];

        int scienceTotal = 0;
        for (int i = 0; i < sciences.length; i++) {
            sciences[i] = Integer.parseInt(br.readLine());
            scienceTotal += sciences[i];
        }

        int socialTotal = 0;
        for (int i = 0; i < socials.length; i++) {
            socials[i] = Integer.parseInt(br.readLine());
            socialTotal += socials[i];
        }

        Arrays.sort(sciences);
        Arrays.sort(socials);
        scienceTotal -= sciences[0];
        socialTotal -= socials[0];

        System.out.println(scienceTotal + socialTotal);
        br.close();
    }
}