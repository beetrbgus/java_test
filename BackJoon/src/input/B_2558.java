package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//세자리수 곱셈 증명
public class B_2558 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		br.close();
		int bOne = b%10;
		int bTen = (b%100 - bOne)/10;
		System.out.println(a*bOne);
		System.out.println(a*bTen);
		System.out.println(a*(b/100));
		System.out.println(a*b);
	}
}
