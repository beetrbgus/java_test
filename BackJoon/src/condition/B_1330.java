package condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 두 수 비교
public class B_1330 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		br.close();
		String[] arr = n.split(" ");
		
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		String msg;
		if(a>b) {
			msg=">";
		}else if(a<b) {
			msg="<";
		}else {
			msg="==";
		}
		System.out.println(msg);
	}
}
