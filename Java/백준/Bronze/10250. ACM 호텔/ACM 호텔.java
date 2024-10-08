import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(bf.readLine());
        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");


            int H = Integer.parseInt(st.nextToken());
            st.nextToken();
            int N = Integer.parseInt(st.nextToken());

            if(N % H ==0){
                sb.append((H * 100) + (N/H)).append('\n');
            }else {
                sb.append(((N % H) * 100) + ((N/H) + 1)).append('\n');
            }
        }
        System.out.print(sb);
    }

}