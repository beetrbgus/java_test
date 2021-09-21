package secondArray;

import java.util.Scanner;

public class C_1465 {
	public static void main(String[] args) {
		/*
		 * 
		 * 입력이 3 4인 경우 다음과 같이 출력한다.
		9 10 11 12
		5 6 7 8
		1 2 3 4
		
		입력이 4 5인 경우는 다음과 같이 출력한다.
		16 17 18 19 20
		11 12 13 14 15
		6 7 8 9 10
		1 2 3 4 5
		 */

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int first = n * m;
		if (n >= 1 && m <= 100) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {	  
					System.out.print((first)-(m*i) + j + " ");
				}
				System.out.println();
			}

		}
	}
}
