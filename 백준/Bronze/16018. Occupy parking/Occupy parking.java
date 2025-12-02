import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[] parkingY = new char[N];
        char[] parkingT = new char[N];

        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            parkingY[i] = str.charAt(i);
        }

        str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            parkingT[i] = str.charAt(i);
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (parkingY[i] == 'C' && parkingT[i] == 'C') {
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }
}