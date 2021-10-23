package whileexam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1110 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n =  Integer.parseInt(br.readLine());
		int init = n ; 
		int cycle = 0;
		if(n >= 0 && n <=99) {
			boolean isloop = true ;
			if( n < 10) {
				n = n * 10 ; 
			}
			while(isloop) {
				int first =  n / 10 ;
				int second = n % 10 ;
				
				int result = first + second ; 
				
				n  = second * 10 + result % 10 ;
				
				if(init == n) {
					break; 
				}
				cycle ++ ; 
			}
		}
		System.out.println(cycle);
	}
}
