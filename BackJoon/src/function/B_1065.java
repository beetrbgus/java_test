package function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1065 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("입력할 숫자를 적으세요.");
		String x = br.readLine();
		int n = Integer.parseInt(x); // 입력받은 수를 문자에서 숫자로.
		int cnt = 0 ; //갯수 증가를 위한 변수
		
		for (int i = 1; i <= n; i++) {
			if(arithmeticSequence(i)) cnt++;
		}
		System.out.println(cnt);
	}

	// 등차 수열인지 판단하는 메서드
	public static boolean arithmeticSequence(int a) {
		boolean result = true;
		int chr = a%10 - (a%100 - a%10)/10; //등차수열인지 판단하기 위한 차
		while(result) {
			a = a/10; // 위에서 등차수열 판단 했으니까 10 나눠서 진행.
			if(a / 10 ==0) break; //두개의 자릿수 비교해야해서 10보다 작으면 비교 불가.
			if(chr != a%10 - (a%100 - a%10)/10) { // 처음에 구한 차랑 나중에 구한 차가 다르면 등차수열 아님
				result = false;
			}
		}
		return result;
	}
}
