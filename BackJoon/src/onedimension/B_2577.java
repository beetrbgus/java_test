package onedimension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//최댓값을 출력하고, 최댓값이 몇 번째 수인지를 출력
public class B_2577 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		br.close();
		
		int multiple = a * b * c ; 
		String unitStr = String.valueOf(multiple);
		int[] arr = getUnitArr(unitStr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	public static int[] getUnitArr(String unitStr) {
		
		int unitsCnt = 10; //0-9의 자릿수
		int[] unitsArr = new int[unitsCnt]; //일의 자리 배열
		
		int unitlength = unitStr.length();
		for(int i=0; i<unitlength;i++) {
			char unit = unitStr.charAt(i);
			int num = Integer.parseInt(String.valueOf(unit));
			unitsArr[num]++; //해당 숫자의 인덱스 증가. 
		}
		return unitsArr;
	} 
}
