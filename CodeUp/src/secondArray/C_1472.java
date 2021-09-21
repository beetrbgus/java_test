package secondArray;

import java.util.Scanner;

public class C_1472 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		int arr[][] = new int[n][m];
		int count = 0;
		if (n >= 1 && m <= 100) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					count++;
					if (i % 2 == 0) {
						arr[n-(i+1)][m-(j+1)] = count;		
					} else {
						arr[n-(i+1)][j] = count;
					}
				}
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
