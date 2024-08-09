import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] p = new int[8];

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < 8; i++){
            p[i] = Integer.parseInt(st.nextToken());

        }
        if (p[0] == 1) {
            for (int i = 1; i < 8; i++){
                if(p[i] != p[i - 1] + 1){
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("ascending");
        }else if (p[0] == 8){
            for(int i = 1; i < 8; i++){
                if(p[i] != p[i - 1] - 1){
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("descending");
        }else if (p[0] != 1 && p[0] != 8){
            System.out.println("mixed");
        }
    }
}