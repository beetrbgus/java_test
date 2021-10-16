package secondArray;

import java.util.Scanner;

public class C_4085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int arr[][] = new int[n][m];
		
		for(int i = 0 ; i < n ; i ++) {
			for(int j = 0 ; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int ka  = 0 ;
		for(int i = 0 ; i < n ; i ++) {
			for(int j = 0 ; j < m; j++) {
				
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		
		
		
		
		System.out.println();
	}
}
