import java.io.IOException;
import java.time.Instant;

public class Main {

    public static void main(String[] args) throws IOException {
        Instant now = Instant.now();
        String time = String.valueOf(now);
        System.out.println(time.substring(0,4));
        System.out.println(time.substring(5,7));
        System.out.println(time.substring(8,10));
    }
}