package stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11720 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		int nNum = Integer.parseInt(n);
		
		// 1 <= N <= 100
		if (nNum < 1 || nNum > 100) { 
			System.out.println("입력될 숫자는 1과 100 사이입니다.");
			System.exit(0);
		} 

		String input = br.readLine();

		if (nNum == input.length()) { // 입력한 숫자의 갯수와 정한 숫자 갯수가 같아야 함.
			int result = sum(input);
			System.out.println(result);
		}
	}

	public static int sum(String input) {
		final int length = input.length(); //
		int sum = 0;
		for (int i = 0; i < length; i++) {
			String split = input.substring(i, i + 1);
			sum += Integer.parseInt(split);
		}
		return sum;
	}
}
