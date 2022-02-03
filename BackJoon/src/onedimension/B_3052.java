package onedimension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
public class B_3052 {
	private static final int INPUTCNT = 10; //입력 받을 갯수
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int modNumber = 42; 
		int[] modArr =  new int[INPUTCNT];//일의 자리 배열
		
		for (int i = 0; i < INPUTCNT; i++) {
			//배열의 i번 째에 42로 나눈 나머지 값 저장해둠
			modArr[i] =(Integer.parseInt(br.readLine()) % modNumber); 
		}
		br.close();
		
		int result = compareModValue(modArr);
		System.out.println(result);
		
	}
	//42로 나눈 값 나머지 비교 
	public static int compareModValue(int[] modArr){
		int notDuplicate = 0 ;
		for(int i=0;i<modArr.length;i++) {
			boolean isDuplicate = false; //중복값 확인 체크
			for(int j=i+1;j<modArr.length;j++) {
				if(modArr[i] == modArr[j]) { 
					isDuplicate =true; break;  
				}
			}
			//중복 여부 검사 후 중복 아니면 중복 아닌것 갯수 증가.
			if(!isDuplicate) notDuplicate++;
		}
		return notDuplicate;
	}
}
