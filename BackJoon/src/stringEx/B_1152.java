package stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 단어 세기
public class B_1152 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine().trim();//앞뒤 공백 제거
		br.close();
		 
		int cnt = 0; //빈칸일 때는 바로 0 길이 반환.
		if(!n.isEmpty()) { // n이 빈칸이 아닐 때 실행
			cnt = n.trim().split(" ").length;		
		}
		System.out.println(cnt);
	}
}
