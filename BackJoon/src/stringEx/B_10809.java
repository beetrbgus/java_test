package stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_10809 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		int[] arr = sum(input);
		printArr(arr);
	}

	public static int[] sum(String input) {
		int[] arr = new int[26];
		final int length = input.length(); //
		Arrays.fill(arr, -1); // -1로 초기화 해놓기.

		for (int i = 0; i < length; i++) {

			char a = input.charAt(i);
			// char를 아스키 코드로 바꾸기 + 97 빼서 a( = 0번째 인덱스 ) 부터 차곡차곡
			int result = (int) a - 97;

			// 처음 나온 위치만 있어야 하기 때문에 -1 외의 값일 때 값 집어넣기
			if (arr[result] == -1) {
				arr[result] = i;
			}
		}
		return arr;
	}

	public static void printArr(int[] arr) {
		final int length = arr.length; //
		for (int i = 0; i < length; i++) {
			String msg="";
			if( i != length-1)	msg=" ";
			else msg="";
			System.out.print(arr[i] + msg);

		}
	}
}
