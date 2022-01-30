package basicmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1712 {
	//백준 1712번 손익분기점 문제
	public static void main(String args[]) throws IOException {
		// 고정비 -> a 만원 ,가변비 -> b 만원 , 노트북 -> c 만원에 팜.
		// 손익 분기 계산 =   nC >= A + nB    n(C-B) >= A 
		   
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] inputArr = input.split(" "); // 입력받은 값 배열로 나눠버림
		
		// 배열에서 값 숫자로 추출
		int a = Integer.parseInt(inputArr[0]);
		int b = Integer.parseInt(inputArr[1]);
		int c = Integer.parseInt(inputArr[2]);
		
		int cnt = howManyMakeNotebook(a,b,c);
		System.out.println(cnt);
		br.close();
		
	}
	public static int howManyMakeNotebook(int a, int b, int c) {
		if(b >= c) return -1;
		return  a / (c-b) +1;
	}
} 
