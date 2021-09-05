package data_Sort;

import java.util.Scanner;

public class C_1172 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];

		// 일시적인 저장소 만듦.
		
		// 스캐너로 입력받는데 실수 할 수도 있으니까 while로 돌리기.
		int i = 0;
		
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		
		int temp;
		for (int j = 0; j < arr.length; j++) {
			
			for(int k = j+1 ; k < arr.length ; k ++) {
				// 해당 차례가 다음것보다 크면 위치 변경
				if (arr[j] > arr[k]) {
					temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp ; 
				}
			}
		}
		for(int k = 0 ; k < arr.length ; k ++) {
			System.out.print(arr[k]+" ");
		}
	}
}
