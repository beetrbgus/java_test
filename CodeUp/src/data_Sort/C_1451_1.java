package data_Sort;

import java.util.Scanner;

public class C_1451_1 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			arr[i] = a;
		}
		int temp ;  
		for(int i = 1 ; i < arr.length ; i ++) {
			
			for(int j = i ; j  > 0 ; j -- ) {
				if(arr[j] < arr[j-1]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp ; 
				}else {
					break;
				}
			}
		}
		sc.close();
		for(int a : arr) {
			System.out.println(a);
		}
	}
}
