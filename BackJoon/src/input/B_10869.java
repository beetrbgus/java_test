package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 사칙연산
public class B_10869 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		br.close();
		String[] arr = n.split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		System.out.println(sum(a,b));
		System.out.println(minus(a,b));
		System.out.println(multiple(a,b));
		System.out.println(devide(a,b));
		System.out.println(mod(a,b));
	}
	public static int sum(int a , int b) {
		return a+b;
	}
	public static int minus(int a , int b) {
		return a-b;
	}
	public static int multiple(int a , int b) {
		return a*b;
	}
	public static int devide(int a , int b) {
		return a/b;
	}
	public static int mod(int a , int b) {
		return a%b;
	}
}