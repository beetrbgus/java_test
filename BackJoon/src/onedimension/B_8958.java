package onedimension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//OX 퀴즈 점수 구하기
public class B_8958 {
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 테스트 케이스
		int number = Integer.parseInt(br.readLine());
		br.close();
		
		int score = 0; //총점
		int quizScore = 0; //해당 문제의 점수 초기화
		
		for (int i = 0; i < number; i++) {
			String[] inputArr = br.readLine().split(" ");
			for (int j = 0; j < number; j++) {
				//i번째 정답유무 
				if (inputArr[j].equals("O")) {
					quizScore++;
					score+=quizScore;
				}else {
					quizScore=0;
				}
			}
		}
		System.out.println(score);

	}
}
