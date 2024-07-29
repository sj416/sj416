import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        String a = bf.readLine();
        int total = 0;
        for(int i = 0; i < N; i++){

            total += a.charAt(i)-'0';
        }
        System.out.println(total);
    }
}