package onedimension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//시험 점수 평균 조작하기.
public class B_1546 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 시험 본 과목 갯수
		int number = Integer.parseInt(br.readLine());
		int max = -1; //최대 점수를 구하기 위한 값
		String[] inputArr = br.readLine().split(" ");
		br.close();
		
		double sum = 0;
		if (number != inputArr.length) {
			System.out.println("시험 본 과목 갯수와 입력 갯수가 일치하지 않습니다.");
			System.exit(0);// 정상 종료
		}
		int arrlength = inputArr.length;
		for (int i = 0; i < arrlength; i++) {
			//i번째 점수 
			int ele = Integer.parseInt(inputArr[i]);
			if (max < ele) {
				max = ele;
			}
			sum += ele;
		}
		double avg = (sum / number) / max * 100; //새로운 평균
		System.out.println(avg);

	}
}
