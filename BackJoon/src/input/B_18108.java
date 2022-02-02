package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_18108 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		br.close();
		int taiBirth = Integer.parseInt(n);
		System.out.println(taiBirth-543);
	}
}
