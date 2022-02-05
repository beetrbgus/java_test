package basicmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//층과 거주자 수의 규칙 찾기
public class B_2775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());// 테스트 케이스
		for (int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());// 층
			int n = Integer.parseInt(br.readLine());// 호
			System.out.println(getLivedPeople(k, n));
		}
	}

	public static int getLivedPeople(int k, int n) {
		if (n == 1)return 1; //1호 = 모두 1명
		if (n == 2)return k+2; // 2호 = 층수+2명
		int[][] arr = new int[k+1][n];//0층도 있어야 되니까 배열길이 +1
		for (int i = 0; i < k+1; i++) {
			arr[i][0] = 1;//1호 사람은 1명 배열에 추가
			for (int j = 1; j < n; j++) {
				if(i==0) arr[0][j] = j+1; //0층 사람은 j명임
				// i층의 j호 = 전 층의 사람 + 현재층의 이전호수 
				else arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
			}
		}
		return arr[k][n-1]; // k층의 n호 
	}
}
