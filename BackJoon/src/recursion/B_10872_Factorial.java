package recursion;

import java.util.Scanner;

public class B_10872_Factorial {
	public static int fact(int n ) {
		int a = 1;
		if(n <= 1) {
			return a;
		}
		else {
			return n * fact(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int result = fact(n);
		System.out.println(result);
	}
}
