import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        for (int i = 0; i < a;i++){
            for(int j = a-1; j >= 0;j--){
                if (i < j){
                System.out.print(" ");

                }else if(i >= j){

                System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

