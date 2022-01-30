package stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 단어공부 ( 많이 쓰인 알파벳 찾기.)
public class B_1157 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine().toUpperCase(); // 대문자로 받기.

		if(n.trim().length()==1) { // 길이가 1이면 그냥 해당 알파벳 반환.
			System.out.println(n);
		}else {
			System.out.println(mostUsedAlphabet(n));
		}
		br.close();
	}
	
	public static String mostUsedAlphabet(String word) {
		int[] alphabetArr = new int[26];
		int wordLength = word.length();
		
		for (int i = 0; i < wordLength; i++) {
			char alphabet = word.charAt(i); //단어의 알파벳 뽑기.
			int alphabetIndex = (int)alphabet - 65;
			alphabetArr[alphabetIndex]++; // 해당 알파벳 순번의 배열값 증가.
		}
		return returnAlphabet(alphabetArr); //알파벳으로 반환할 값 구함. 
	}

	public static String returnAlphabet(int[] alphabetArr) {
		int arrlength =alphabetArr.length;
		int maxindex = 0; //최대 값의 인덱스 번호 찾기 위해.
		int max = -1; //최대 값 자체를 찾기 위해. 0이면 0인 알파벳이랑 겹쳐서 안됨.
		
		for(int i = 0; i<arrlength;i++) {
			if( max < alphabetArr[i]) {	// max가 작으면 갱신되어야 함.
				max = alphabetArr[i];
				maxindex = i;
			}else if(max == alphabetArr[i]){ //max가 같으면 ? 표로
				maxindex = -2; // 물음표 아스키 = 63번이라 -2
			}
		}
		return String.valueOf((char)(maxindex+65));
	}
}
