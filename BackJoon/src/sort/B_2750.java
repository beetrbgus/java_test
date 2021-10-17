package sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B_2750 {
	public static void main(String[] args) {
		//오름 차순 정렬
//		List<Integer> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			arr[i] =  num;
		}
		sc.close();
		for (int i = 0; i < n; i++) {
			for (int j = i; j > 0; j--) {
				int arrJ = arr[j];
				int arrJpre = arr[j-1];
				if (arrJ < arrJpre ) {
					arr[j] = arrJpre;
					arr[j-1] = arrJ;
				}

			}
		}
		for(int a : arr) {
			System.out.println(a);
		}
	}
}
