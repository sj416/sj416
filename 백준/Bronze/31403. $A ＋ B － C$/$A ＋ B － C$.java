import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(bf.readLine());
		int B = Integer.parseInt(bf.readLine());
		int C = Integer.parseInt(bf.readLine());
		
		String s = "";
		s += A;
		s += B;
		
		System.out.println(A + B - C);
		System.out.println(Integer.parseInt(s) - C);
	}

}