package secondArray;

import java.util.Scanner;

public class C_1484 {
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
		int mExecute = 0;
		int nExecute = 0;
		boolean isxPlus = true;
		boolean isyPlus = true;
		// 전체 도는 횟수 :   n  * m 번  : start 로 횟수 정함.
		while (true) {
			// m열의 도는 횟수는 처음 m 부터 한바퀴 돌 때마다 1씩 감소함.
			for (int i = 0; i < m - nExecute; i++) {
				System.out.println("위");
				arr[x][y] = start;
				System.out.println("arr[" + x + "][" + y + "] :  " + arr[x][y]);
				start++;
				if (i + 1 != (m - nExecute)) {
					if (isyPlus) {
						y++;
					} else {
						y--;
					}
				} else {
					break;
				}

			}
			mExecute++;
			isyPlus = !isyPlus;

			for (int i = 0; i < n - mExecute; i++) {
				System.out.println("아래");
				
				if (i + 1 != (n - mExecute)) {
					if (isxPlus) {
						System.out.println();
						x++;
					} else {
						x--;
					}
					arr[x][y] = start;
					System.out.println("arr[" + x + "][" + y + "] :  " + arr[x][y]);
					start++;
				} else {
					break;
				}

			}
			nExecute++;
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
