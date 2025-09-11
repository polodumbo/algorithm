import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double weight = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());
        double bmi = weight / (height * height);

        if (bmi > 25) {
            System.out.println("Overweight");
        } else if (bmi < 18.5) {
            System.out.println("Underweight");
        } else {
            System.out.println("Normal weight");
        }

        br.close();
    }
}