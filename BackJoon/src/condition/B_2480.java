package condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//주사위 같은 갯수로 상금 다르게.
public class B_2480 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
		String[] inputArr =input.split(" ");
		int a =Integer.parseInt(inputArr[0]);
		int b =Integer.parseInt(inputArr[1]);
		int c =Integer.parseInt(inputArr[2]);
		
		int result = 0;
	
		if(a==b&&b==c&&c==a) result = (10+a)*1000; //모두 같으면
		else if(a!=b&&a!=c&&b!=c) { //모두 같지 않으면
			int big = (a>b)?a:b;
			int biggest = (big >c?big : c);
			result = biggest*100;
		}else { //2개가 같으면
			if(a==b) result = (10+a)*100;
			else if(a==c) result = (10+a)*100;
			else if(b==c) result = (10+c)*100;
		}
		System.out.println(result);
	}
}
