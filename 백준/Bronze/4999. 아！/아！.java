import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String patient = br.readLine();
        String doctor = br.readLine();

        System.out.println(patient.length() >= doctor.length() ? "go" : "no");

        br.close();
    }
}