package function;

import java.util.Scanner;

public class C_1602 {

	public static Double funcSubString(Double a) {
		if(a < 0) {
			a = - a;
		}
		return a;
	}
	public static int funcSubString(int a) {
		if(a < 0) {
			a = - a;
		}
		return a;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		if(a.contains(".")) {
			double parseA = Double.parseDouble(a);
			System.out.println(funcSubString(parseA));
		}
		else {		
			int parseA = Integer.parseInt(a);
			System.out.println(funcSubString(parseA));
		}
		
		sc.close();
	}
}
