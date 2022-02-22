package brouteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//분해합 문제
public class B_2231_DividePlus {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		System.out.println(make_boonhae(input));
	}

	public static int make_boonhae(String input) {
		int inputNum = Integer.parseInt(input);
		int result = 0;//없을 경우 대비 
		for (int i = 0; i < inputNum; i++) {
			int hap = 0 ; //각 자릿수의 합
			int num = i ; //i로 while문을 돌려버리면 i자체가 0이 되어버려서 무한반복
			while(num!=0) {
				hap+= num%10; //각 자릿수 더하기
				num/=10;
			}
			if (inputNum == hap+ i) { //각 자릿수 합 + i가 입력된 값과 같을 때
				result = i; //결과 값 반환.
				break;
			}
		} 
		return result;
	}
}
