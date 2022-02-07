package stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//다이얼 걸기 위한 최소 시간
public class B_5622 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		sb.append(br.readLine());
		// 각 테스트 케이스의 반복문

		int result = 0;
		for (int i = 0; i < sb.length(); i++) {
			int time = 3;
			char eleChar = sb.charAt(i);
			int a = (int) eleChar;
			if (a >= 65 && a < 80)
				time += (a - 65) / 3;
			else if (a >= 80 && a <= 83) {
				time += 5;
			} else if (a > 83 && a <= 86) {
				time += 6;
			} else if (a >= 87 && a <= 90) {
				time += 7;
			}
			result += time;
		}
		System.out.println(result);
		br.close();
	}
}
