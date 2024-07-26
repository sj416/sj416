import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String a = "";

        for(int i = 1; i<= N/4; i++ ){
            a += "long ";
        }
        System.out.println(a + "int");
      }
    }