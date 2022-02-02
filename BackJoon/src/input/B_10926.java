package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 물음표붙이기
public class B_10926 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		br.close();
		System.out.println(n+"??!");
	}
}