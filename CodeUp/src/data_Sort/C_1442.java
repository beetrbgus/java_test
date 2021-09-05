package data_Sort;

import java.util.Scanner;

public class C_1442 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n];
		int temp;
		int min;
		// 데이터 입력받기.
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		// 1 ~ 배열길이 -1 까지
		for (int i = 0; i < n; i++) {
			min = i;
			for (int j = i + 1; j < n; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}

	}

}
