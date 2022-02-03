package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1001 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		br.close();
		String[] arr = n.split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		System.out.println(a-b);
	}
}