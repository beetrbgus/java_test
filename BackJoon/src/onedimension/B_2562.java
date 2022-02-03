package onedimension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//최댓값을 출력하고, 최댓값이 몇 번째 수인지를 출력
public class B_2562 {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = 9; //9개의 숫자 받음
		int max = -1; //입력되는 수는 자연수
		int index = -1; // 몇번째 수인지
		for (int i = 0; i < input; i++) {
			int number = Integer.parseInt(br.readLine());
			if(max < number) { 
				max = number; 
				index = i + 1 ;
			}
		}
		br.close();	
		System.out.println(max);
		System.out.println(index);
	}
}
