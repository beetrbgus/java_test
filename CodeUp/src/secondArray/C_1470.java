package secondArray;

import java.util.Scanner;

public class C_1470 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.close();
		int arr[][] = new int[n][n];
		int count = 0;
		if (n >= 1 && n <= 100) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					count++;
					if (i % 2 == 0) {
						arr[j][i] = count;
					} else {
						arr[n-(j+1)][i] = count;
					}
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
