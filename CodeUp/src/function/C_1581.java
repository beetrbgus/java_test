package function;

import java.util.Scanner;

public class C_1581 {

	public static void swapFunction(int a , int b) {
		int bigger, smaller ;
		if(a>b) {
			bigger = a;
			smaller = b;
		}
		else {
			bigger = b;
			smaller = a;	
		}
		System.out.println(smaller);
		System.out.println(bigger);
	}
	// 괄호 []있으면 못푸는 컴파일 방식이라 포기 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		swapFunction(a,b);
		sc.close();
	}
}
