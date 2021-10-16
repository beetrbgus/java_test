package recursion;

import java.util.Scanner;

public class B_10870_Fibonacci {
	public static int f(int n ) {
		if(n==0) return 0;
		if(n==1) return 1;
		else return f(n-1) + f(n-2);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int result = f(n);
		System.out.println(result);
	}
}
