package onedimension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;
//반 평균 구하기 (2안)
public class B_4344_2 {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 테스트 케이스
		int number = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < number; i++) {
			String[] input = br.readLine().split(" ");
			// input을 int 배열에 옮겨 닮는게 메모리, 시간도 오래걸림
			int[] numInput = new int[input.length-1];
            for(int j=0;j<numInput.length;j++){
                numInput[j] = Integer.parseInt(input[j+1]);
            }
			int studentCnt = Integer.parseInt(input[0]);
			int sum = getSum(numInput);			
			int avg = sum/studentCnt;			
			int overAverage = getOverAverageStudent(avg, numInput);
			double rate =(double)overAverage/studentCnt*100;
			
			System.out.printf("%.3f%%\n",rate);
		}
		br.close();
	}
	public static int getSum(int[] numInput) {
		int sum = 0;
		for(int j=0;j<numInput.length;j++) {
			sum +=numInput[j];
		}
		return sum;
	}
	public static int getOverAverageStudent(int avg , int[] numInput) {
		int overAverage = 0;//평균 넘는 학생의 수 세는 변수
		
		for(int j=0;j<numInput.length;j++) {
			//평균을 초과 해야 함.
			if(avg <numInput[j])overAverage++;
		}
		return overAverage;
	}
}
