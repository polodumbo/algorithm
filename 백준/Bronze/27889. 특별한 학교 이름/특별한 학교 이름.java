import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char c = br.readLine().charAt(0);

        switch (c) {
            case 'N':
                System.out.println("North London Collegiate School");
                break;
            case 'B':
                System.out.println("Branksome Hall Asia");
                break;
            case 'K':
                System.out.println("Korea International School");
                break;
            case 'S':
                System.out.println("St. Johnsbury Academy");
                break;
        }
        br.close();
    }
}