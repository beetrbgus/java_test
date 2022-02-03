package onedimension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//입력된 값 중 최솟값 최댓값 구하기. 
public class B_10818 { 
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] numberArr = br.readLine().split(" ");
		br.close();
		int inputCnt = numberArr.length;
		
		//입력할 갯수와 입력된 갯수가 같아야 실행
		if(Integer.parseInt(input) == inputCnt) {
			int max = -1000001; // 입력값은 -1000001보다 큼
			int min =  1000001; // 입력값은  1000001보다 작음
			 
			for (int i = 0; i < inputCnt; i++) {
				int number = Integer.parseInt(numberArr[i]);
//				min = (min > number)?number:min;
//				max = (max < number)?number:max;
				
				if(min > number) {
					min = number;
				}
				if(max < number) {
					max = number;
				}
			}
			
			System.out.println(min+" "+max);
		}		
		
	}
}
