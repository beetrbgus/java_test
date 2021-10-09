package function;

import java.util.Scanner;

public class C_1610 {

	public static String funcSubString(String a, int start, int count) {

		char[] arr = a.toCharArray();
		String result = "";
		if(start + count <= a.length()) {
			for (int i = start; i < start+count; i++) {
				result += arr[i];
			}			
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int start = sc.nextInt();
		int count = sc.nextInt();
		System.out.println(funcSubString(a, start, count));
		sc.close();
	}
}
