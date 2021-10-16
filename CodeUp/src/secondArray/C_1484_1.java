package secondArray;

import java.util.Scanner;

public class C_1484_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int rownum = n * m;
		sc.close();
		int arr[][] = new int[n][m];

		int x = 0;
		int y = 0;
		int start = 1;

		boolean isxPlus = true;
		boolean isyPlus = true;

		while (true) {
			while (true) {
				if (isyPlus) {
					System.out.println("yPlus 차례");
					arr[x][y] = start;
					System.out.println("arr[" + x + "][" + y + "] :  " + arr[x][y]);
					start++;
					if (y + 1 == m) {

						break;
					}
					y++;

				} else {
					System.out.println("yMinus 차례");
					System.out.println("y    " + y);
					y--;
					arr[x][y] = start;
					System.out.println("arr[" + x + "][" + y + "] :  " + arr[x][y]);
					start++;
					if (y == 0) {

						break;
					}
					
				}
			}
			m--;
			isyPlus = !isyPlus;
			
			while (true) {
				if (isxPlus) {
					System.out.println("xPlus 차례");
					System.out.println( n  + "xx    " + x);
					
					if (x+1== n) {

						break;
					}
					x++;
					arr[x][y] = start;
					start++;

					System.out.println("arr[" + x + "][" + y + "] :  " + arr[x][y]);

				} else {
					System.out.println("xMinus 차례");
					if (x == n) {
						break;
					}
					arr[x][y] = start;
					System.out.println("arr[" + x + "][" + y + "] :  " + arr[x][y]);
					x--;
					start++;

				}
			}
			n--;
			isxPlus = !isxPlus;
			
			if (start > rownum) {
				System.out.println("뿌렉");
				break;

			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
				System.out.print(arr[i][k] + " ");
			}
			System.out.println();
		}

	}
}
