package basicmath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//소수 구하기- 방법1 
public class B_1978 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		
		int nNum = Integer.parseInt(n);
		int cnt  = 0 ;
		
		String input = br.readLine();
		String[] arr = input.split(" ");
		//입력 길이 다를 시 예외 처리
		if(nNum != arr.length) System.exit(1);
		
		for(int i = 0; i < arr.length;i++) {
			int ele = Integer.parseInt(arr[i]);
			if(ele==1) {
				continue;
			}
			boolean isPrime = true;
			//일단 무식하게 2부터 자기자신 전까지 나눈 다음 나머지로 판별
			for(int j=1;j<ele;j++) {
				if(j==1)continue;
				if(ele%j == 0){
					isPrime = false; 
					break;
				}
			}
			//소수면 증가
			if(isPrime==true)cnt++;
		}
		System.out.println(cnt);
		br.close();
	}
}
