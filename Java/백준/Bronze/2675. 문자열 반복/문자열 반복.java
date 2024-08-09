import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());

        for(int i = 0; i < T; i++) {

            String[] str = bf.readLine().split(" ");

            int R = Integer.parseInt(str[0]);

            String S = str[1];

            for(int j = 0; j < S.length();j++){
                for(int z = 0; z < R; z++){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}