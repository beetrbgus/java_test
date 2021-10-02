package secondArray;

import java.util.Scanner;

public class C_1473 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		int arr[][] = new int [n][m];
		int start = 0 ;
		for(int i =1; i <= n ; i ++) {
			for(int j =1; j <= m ; j ++) {
				start ++ ;
				if(i%2 !=0){
					arr[n-i][j-1] = start;
				}
				else {
					arr[n-i][m-j] = start;
				}
				 
			}
		}
		
		for(int i =0; i < n ; i ++) {
			for(int j =0; j < m ; j ++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
