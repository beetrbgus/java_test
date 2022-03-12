package stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
public class B_2941_크로아티아문자 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		br.close();
		int result = 0;
		
		for(int i=0;i<n.length();i++) {
			char now = n.charAt(i);
			boolean isOne = i<n.length()-1 ;
			char next='1';
			if(isOne) next = n.charAt(i+1);
			
			if(isOne&&now=='c') {
				if(next=='='||next=='-') {
					i++;
				}
			}else if(isOne&&now=='d') {
				if(next=='-') {
					i++;
				}else if(next=='z') {
					if(i<n.length()-2&& n.charAt(i+2)=='=') {
						i+=2;
					}
				}
			}else if(now=='l'||now=='n') {
				if(isOne&&next=='j') {
					i++;
				}
			}else if(now=='s'||now=='z') {
				if(isOne&&next=='=') {
					i++;
				}
			}
			result++;
			
		}
		System.out.println(result);
	}
}
