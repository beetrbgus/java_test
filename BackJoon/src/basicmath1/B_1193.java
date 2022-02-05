package basicmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//분수 찾기
public class B_1193 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 단 수를 구한 후 n에서 이동할 수만큼 빼고 , 1에서 이동할 수만큼 증가시킴
		int t = Integer.parseInt(br.readLine());
		br.close();
		String result = getdan(t);
		System.out.println(result);
	}
	//단 수 구하기
	public static String getdan(int input) {
		int floor = 1;
		while(true){
			if(input<=floor) {
				break;
			}
			input-=floor; 
			floor++;
		}
		return getfraction(input,floor);
	}
	public static String getfraction(int input,int floor) {
		//floor - 단 수 , input - 가야될 수
		String devide="/";
		int big = floor -(input-1);
		int small = 1 +(input-1);
		// 단 : 1 , 3 단 : 홀수 =  n/1 시작
		// 단 : 2 , 4 단 : 짝수 =  1/n 시작		
		if(floor%2==1) devide = big+devide+small;
		else devide = small+devide+big;
		return devide;
	}
}
