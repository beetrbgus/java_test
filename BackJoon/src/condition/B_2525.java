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
		int a = Integer.parseInt(arr[0]); //요리할 시각
		int b = Integer.parseInt(arr[1]); //요리할 분
		
		int c = Integer.parseInt(br.readLine()); //걸리는 시간
		br.close();
		b+=c; // 요리할 분 + 걸리는 시간 = 구할 분의 기초가 됨.
		a+=b/60; // 분을 시간으로 치환
		
		a%=24; //24시간 기준으로 두기.
		b%=60; //60분 기준으로 만들기. 
		
		System.out.println(a+" "+b);
	}
}
