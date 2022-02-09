package brouteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//브루트 포스 뜻 : 무식하게 다 해보기
public class B_2798 {
	// 딜러가 바닥에 놓는 카드의 갯수 : N ( 3 ~ 100 사이)
	// 딜러가 외치는 숫자 : M
	// N 장 중 3장을 골라야 함.
	// M 을 넘지 않으면서 최대한 가깝게 만들기
	// 출력 : 선택한 3장의 합 구해 출력하기

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		String[] arr = input.split(" ");
		int n = Integer.parseInt(arr[0]);// 카드 갯수
		int m = Integer.parseInt(arr[1]);// 총 합
		String cardInput = br.readLine();
		String[] cardArr = cardInput.split(" ");

		br.close();
		int approximation = 0; // 근사값
		boolean isBlackJack = false;
		// 무조건 세장 뽑기 때문에 n-2 해야 쓸데없는 자원낭비 안함.
		for (int i = 0; i < n - 2; i++) {
			int sum = 0; // 합계 저장 변수
			int first = Integer.parseInt(cardArr[i]);
			
			if (first > m) continue;
			for (int j = i + 1; j < n - 1; j++) {
				int second = Integer.parseInt(cardArr[j]);
				if (first + second > m) continue;

				for (int k = j + 1; k < n; k++) {
					int third = Integer.parseInt(cardArr[k]);
					sum = first + second + third; //합계 만듦.
					// 블랙잭이면 멈춤
					if (sum == m) {
						approximation = sum;
						isBlackJack = true;
						break;
					}
					if (sum > m) continue;
					// 근사값것보다 지금 뽑은게 더 크고 뽑은게 m과 작으면 근사값 재설정
					if (approximation < sum && sum < m) {
						approximation = sum;
					}
				}
				if (isBlackJack) {
					break;
				}
			}
			if (isBlackJack) {
				break;
			}
		}
		System.out.println(approximation);
	}
}
