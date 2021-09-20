package secondArray;

import java.util.Scanner;

public class C_1460 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 0 ; 
		for (int i = 0; i < n; i++) {
			for(int j = 0  ; j < n ; j ++) {
				count++;
				System.out.print(count);
			}
			System.out.println();
		}
	}
}
