package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1000 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();//앞뒤 공백 제거
		br.close();
		String[] arr = n.split(" ");
		int cnt = sum(arr);
		System.out.println(cnt);
	}
	public static int sum(String[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+= Integer.parseInt(arr[0]);
		}
		return sum;
	}
}