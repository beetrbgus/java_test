package data_Sort;

import java.util.Scanner;

public class C_1441 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		int a[] = new int[n];
		int temp;
		int nNumber = n ; 
		//데이터 입력받기.
		for(int i = 0 ; i < n ; i ++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		
		for (int i = 1; i < n ; i++) {
			temp = 0 ;
			// 이 부분에 들어가야 될 코드를 작성하여 제출
			for (int j = 0; j < nNumber-1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			nNumber--;
		}
		for(int i = 0 ; i < n ; i ++) {
			 System.out.println(a[i]);
		}
		
	}

}
