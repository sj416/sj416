import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();   //총 가격
        int N = sc.nextInt();   //물건의 종류의 수

        int res = 0;
        for (int i = 1; i <= N; i++){
            int a = sc.nextInt();   //물건의 가격
            int b = sc.nextInt();   //물건의 갯수

            res += (a * b);
        }
        if (res == X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
      }
    }
