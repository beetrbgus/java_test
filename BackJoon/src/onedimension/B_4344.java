package onedimension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;
//반 평균 구하기
public class B_4344 {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 테스트 케이스
		int number = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < number; i++) {
			String[] input = br.readLine().split(" ");
			int studentCnt = Integer.parseInt(input[0]);
			int sum = getSum(input); //점수합 			
			int avg = sum/studentCnt;//평균		
			int overAverage = getOverAverageStudent(avg, input); //평균 이상의 학생수
			double rate =(double)overAverage/studentCnt*100;
			
			DecimalFormat df = new DecimalFormat("###.000"); 
//			System.out.println(df.format(rate)+"%"); //틀렸다고 나옴
			System.out.printf("%.3f%%\n",rate);
		}
		br.close();
	}
	public static int getSum(String[] input) {
		int sum = 0;
		for(int j=1;j<=input.length-1;j++) {
			sum +=Integer.parseInt(input[j]);
		}
		return sum;
	}
	public static int getOverAverageStudent(int avg , String[] input) {
		int overAverage = 0;//평균 넘는 학생의 수 세는 변수
		
		for(int j=1;j<=input.length-1;j++) {
			//평균을 초과 해야 함.
			if(avg <Integer.parseInt(input[j]))overAverage++;
		}
		return overAverage;
	}
}
