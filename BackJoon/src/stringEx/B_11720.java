package stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11720 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		br.close();
		int nNum = Integer.parseInt(n);
		
		// 1 <= N <= 100
		if (nNum < 1 || nNum > 100) { 
			System.out.println("�엯�젰�맆 �닽�옄�뒗 1怨� 100 �궗�씠�엯�땲�떎.");
			System.exit(0);
		} 

		String input = br.readLine();

		if (nNum == input.length()) { // �엯�젰�븳 �닽�옄�쓽 媛��닔�� �젙�븳 �닽�옄 媛��닔媛� 媛숈븘�빞 �븿.
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
