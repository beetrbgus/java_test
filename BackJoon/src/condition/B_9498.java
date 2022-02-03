package condition;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//시험 성적
public class B_9498 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		br.close();		
		int a = Integer.parseInt(n);
		
		String msg;
		if(a >= 90) {
			msg="A";
		}else if(a>=80) {
			msg="B";
		}else if(a>=70) {
			msg="C";
		}else if(a>=60) {
			msg="D";
		}else {
			msg="D";
		}
		System.out.println(msg);
	}
}
