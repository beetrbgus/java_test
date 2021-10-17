package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2750 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] =  num;
		}
		br.close();
		for (int i = 0; i < n; i++) {
			for (int j = i; j > 0; j--) {
				int arrJ = arr[j];
				int arrJpre = arr[j-1];
				if (arrJ < arrJpre ) {
					arr[j] = arrJpre;
					arr[j-1] = arrJ;
				}else {
					break;
				}

			}
		}
		for(int a : arr) {
			System.out.println(a);
		}
	}
}
