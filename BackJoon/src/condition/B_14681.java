package condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//사분면 고르기
public class B_14681 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n1 = br.readLine();
		String n2 = br.readLine();
		br.close();		
		int x = Integer.parseInt(n1);
		int y = Integer.parseInt(n2);
		boolean xisYang = x>0;
		boolean yisYang = y>0;
		int msg;
		if(xisYang && yisYang) {
			msg=1;
		}else if(!xisYang && yisYang) {
			msg=2;
		}else if(!xisYang && !yisYang) {
			msg=3;
		}else{
			msg=4;
		}
		System.out.println(msg);
	}
}
