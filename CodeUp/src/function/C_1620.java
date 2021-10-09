package function;

import java.util.Scanner;

public class C_1620 {

	public static int f(int a) {
		int result = 0;
		boolean isUnderTen = true;
		
		while (isUnderTen) {
			result += a % 10;
			a = a / 10;
			isUnderTen = (a != 0);
		}
		if (result / 10 != 0) {
			return f(result);
		} else {
			return result;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a >= 1 && a <= 10000000) {
			System.out.println(f(a));
		}
		sc.close();
	}
}

//public class Main {
//	public float f() {
//		return 3.14f;
//	}
//	public static void main(String[] args) {
//		Main c = new Main();
//		System.out.println(c.f());
//	}
//}
