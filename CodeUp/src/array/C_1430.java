package array;

import java.util.HashMap;
import java.util.Scanner;

public class C_1430 {

	public static void main(String[] args) {
		HashMap<Integer, Integer>arr = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n >= 1 && n <= 10000000) {
			for (int i = 0; i < n; i++) {
				int num = sc.nextInt();
				if (num >= 1 && num <= 10000000) {
					arr.put(num,1);
				} else {
					i--;
				}
			}
		}

		int m = sc.nextInt();
		if (m >= 1 && m <= 100000) {
			for (int i = 0; i < m; i++) {
				int answer = sc.nextInt();
				if(!arr.containsKey(answer)) {
					System.out.print("0 ");
				}else {
					System.out.print("1 ");
				}
				
			}
		}

		sc.close();
	}

}
