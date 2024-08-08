import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[10];

        int total = Integer.parseInt(bf.readLine()) * Integer.parseInt(bf.readLine()) * Integer.parseInt(bf.readLine());

        String str = String.valueOf(total);

        for (int i = 0;i < str.length();i++){
            arr[(str.charAt(i)-48)]++;
        }

        for (int v:arr){
            System.out.println(v);
        }

    }
}