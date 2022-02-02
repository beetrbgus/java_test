package stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//상수의 거꾸로 된 큰 수 대답하기 - 백준 2908
public class B_2908 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		br.close();
		StringBuilder sb = new StringBuilder();
		// 문자열 역순 (입력된 수는 양수라고 가정)
		String n2 = sb.append(n).reverse().toString();
		// 2개면 굳이 비교할 필요 없지만 2개 이상일 경우 생각해서 풀어보기로 함.
		String[] sangsooAnswer = n2.split(" ");
		int result = getBig(sangsooAnswer);
		 
		System.out.println(result);
	}
	//역순으로 정렬한 문자의 배열 받아 큰 수 찾기
	public static int getBig(String[] sangsooAnswer) {
		int maxStrlength = sangsooAnswer.length;
		int bigNum = 0; //비교를 위한 변수 설정.
		for(int i=0;i<maxStrlength;i++) {
			int compareNum = Integer.parseInt(sangsooAnswer[i]);
			// 해당 수가 크면 바꿈.
			if(bigNum < compareNum) {
				bigNum = compareNum;
			}
		}
		return bigNum;
	}
}
