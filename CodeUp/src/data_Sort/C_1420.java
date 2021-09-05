package data_Sort;

import java.util.Scanner;

public class C_1420 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 배열의 갯수 입력받음.
		int n;
		
		while (true) {
			n = sc.nextInt();

			if (n < 3 && n > 50) {
				continue;
			} else {
				break;
			}
		}
		
		int scoreArr[] = new int[n];
		int scoreArrCopy[] = new int[n];
		String nameArr[] = new String[n];
		for(int i =0  ; i < scoreArr.length ; i ++) {
			nameArr[i] = sc.next();
			scoreArr[i] = sc.nextInt();
			scoreArrCopy[i] = scoreArr[i]; 
			
		}
		int temp;
		// 선택하는 값
		for(int i = 0 ; i < scoreArr.length ; i ++) {
			//선택하는 값보다 앞의 인덱스
			
			for(int j = i ; j > 0 ; j--) {
				temp = 0; 
				if(scoreArrCopy[j-1] < scoreArrCopy[j]) {
					temp = scoreArrCopy[j-1];
					scoreArrCopy[j-1] = scoreArrCopy[j];
					scoreArrCopy[j] = temp ; 
				}
			}
		}
		int resultIndex = 0 ; 
		for(int i = 0 ; i < scoreArr.length ; i ++) {
			if(scoreArrCopy[2] == scoreArr[i]) {
				resultIndex = i ;
			}
		}
		
		// 인덱스 저장해서 찾기
		System.out.print(nameArr[resultIndex]);
	}
}
