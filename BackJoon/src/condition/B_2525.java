package condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력
public class B_2525 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		String[] arr = n.split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		
		
		int c = Integer.parseInt(br.readLine());
		br.close();
		b+=c;
		a+=b/60;
		
		a%=24;
		b%=60;
		
		System.out.println(a+" "+b);
	}
}
