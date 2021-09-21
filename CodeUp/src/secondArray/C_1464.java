package secondArray;

import java.util.Scanner;

public class C_1464 {
	public static void main(String[] args) {
		/*
		 * 
		 * 3 6 9
		   2 5 8
	       1 4 7
		
		 * 입력이 5인 경우는 다음과 같이 출력한다. 
		 * 5 10 15 20 25 
		 * 4 9 14 19 24 
		 * 3 8 13 18 23 
		 * 2 7 12 17 22
		 * 1 6 11 16 21
		 * 
		 * 입력이 n인 경우의 2차원 배열을 출력해보자.
		 */

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int first = n * m ;
		sc.close();
		if (n >= 1 && m <= 100) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					System.out.print(first+ " ");
					first --;
				}
				System.out.println();
			}

		}
	}
}
