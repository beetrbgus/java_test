package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C_1440 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> arr = new ArrayList<>();

		int n = sc.nextInt();
		if (n >= 2 && n <= 1000) {
			for (int i = 0; i < n; i++) {
				int k = sc.nextInt();
				arr.add(k);
			}
		}
		for (int i = 0; i < arr.size(); i++) {
			String result = "";
			for (int j = 0; j < arr.size(); j++) {
				if(i != j ) {
					if (arr.get(i) > arr.get(j)) {
						result += "> ";
					} else if (arr.get(i) < arr.get(j)) {
						result += "< ";
					} else {
						result += "= ";
					}
				}
			}
			System.out.println((i + 1) + ": " + result);
		}
		sc.close();
	}
}
