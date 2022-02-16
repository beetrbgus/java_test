package basicmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//큰 수 더하기.
public class B_10757 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] inputArr = input.split(" ");
		String a = inputArr[0];
		String b = inputArr[1];
		br.close();
		//문자열을 반복시켜서 끝자리수부터 더하기.
		int loopcnt = 0;
		int overTen = 0;
		StringBuilder sb = new StringBuilder();

		while(a.length()>=loopcnt||b.length()>=loopcnt){
			int achar = (a.length()>loopcnt)?(a.charAt(a.length()-1-loopcnt)-48):0;
			int bchar = (b.length()>loopcnt)?(b.charAt(b.length()-1-loopcnt)-48):0;
			int plus = achar + bchar + overTen;
			overTen = (plus>=10)?1:0;
			sb.insert(0,plus%10);
			loopcnt++;
		}
		if(overTen==1)sb.insert(0, 1);
		System.out.println(sb.toString());

	}
}