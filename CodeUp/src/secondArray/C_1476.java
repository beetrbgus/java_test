package secondArray;

import java.util.Scanner;

public class C_1476 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		int arr[][] = new int[n][m];
		int start = 1;
		for (int i = 0; i <= n * m; i++) {
			for (int j = 0; j <= i ; j++) {
				
				arr[i][j] = start;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
