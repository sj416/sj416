import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        int t[] = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        for(int i = 0; i < t.length; i++){
            t[i] = Integer.parseInt(st.nextToken());
        }
            int max = t[0];
            int min = t[0];

            for(int i = 0; i<t.length; i++){
                if(t[i] > max) max = t[i];
                if (t[i] < min) min = t[i];
            }
            System.out.println(min + " " + max);
    }
}