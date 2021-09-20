package secondArray;

import java.util.Scanner;

public class C_1461 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		if(n >= 1 && n <= 100) {
			for (int i = 1; i <= n; i++) {
				for(int j = 0  ; j < n ; j ++) {
					int result = (i * n) - j ;  
					
					if(j == n) {
						System.out.print(result);	
					}
					else{
						System.out.print(result + " ");
					}
				}
				System.out.println();
			}
			
		}
	}
}
