package condition;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

// 윤년 판별
public class B_2753 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		br.close();
		int a = Integer.parseInt(n);
		boolean isyoon = false;
		
		if ((a % 400) == 0) {
			isyoon = true;
		} else if ((a % 100 != 0) && a % 4 == 0) {
			isyoon = true;
		} else {
			isyoon = false;
		}
		System.out.println((isyoon)?1:0);
	}
}
