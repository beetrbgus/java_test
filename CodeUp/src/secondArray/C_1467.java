package secondArray;

import java.util.Scanner;

public class C_1467 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int first = n * m;
		sc.close();
		if (n >= 1 && m <= 100) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= m; j++) {
					System.out.print((first + (i -1 )) - (n * (j)) + 1 + " ");
				}
				System.out.println();
			}

		}
		
	}
}
