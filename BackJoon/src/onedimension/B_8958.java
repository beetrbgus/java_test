package onedimension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//OX 퀴즈 점수 구하기
public class B_8958 {
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 테스트 케이스
		int number = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < number; i++) {
			StringBuilder sb = new StringBuilder();
			int score = 0; //총점
			int quizScore = 0; //해당 문제의 점수 초기화
			sb.append(br.readLine());
			while(sb.toString().length()>0) {
				//정답 한개 자름.
				String result = sb.substring(0,1);
				
				if ( result.equals("O")) {
					quizScore++;
					score+=quizScore;
				}else {
					quizScore=0;
				}
				//사용한 정답 지우기
				sb.delete(0, 1);
			}
			System.out.println(score);
		}
		br.close();
		

	}
}
