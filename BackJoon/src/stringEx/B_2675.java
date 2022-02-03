package stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 문자열 반복문제.
public class B_2675 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		int nNum = Integer.parseInt(n);
		
		//각 테스트 케이스의 반복문
		for(int i=0;i<nNum;i++) {
			String r = br.readLine();
			String[] rsplit = r.split(" ");
			
			int rNum = Integer.parseInt(rsplit[0]); // 반복할 횟수.
			String caseStr = rsplit[1]; // 반복할 문자열
			String caseString = repeatStr(caseStr,rNum);			
			
			System.out.println(caseString);
		}
		br.close();
	}
	
	public static String repeatStr(String caseStr , int rNum) {
		
		int slength = caseStr.length(); 
		StringBuilder caseString = new StringBuilder();
		 
		for(int j=0;j<slength;j++) {
			char casechr = caseStr.charAt(j);
			
			for(int z =0 ; z < rNum; z++) {
				caseString.append(casechr);
			}		
		}
		
		return caseString.toString(); 
	}
}
