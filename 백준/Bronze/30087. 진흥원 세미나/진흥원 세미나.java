import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String className = br.readLine();
            getRoom(className);
        }

        System.out.println(sb);
        br.close();
    }

    public static void getRoom(String className) {
        switch (className) {
            case "Algorithm":
                sb.append(204);
                break;
            case "DataAnalysis":
                sb.append(207);
                break;
            case "ArtificialIntelligence":
                sb.append(302);
                break;
            case "CyberSecurity":
                sb.append("B101");
                break;
            case "Network":
                sb.append(303);
                break;
            case "Startup":
                sb.append(501);
                break;
            case "TestStrategy":
                sb.append(105);
                break;
        }
        sb.append('\n');
    }
}