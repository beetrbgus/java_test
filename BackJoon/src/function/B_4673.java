package function;

import java.io.IOException;

public class B_4673 {
	// 셀프넘버 구하기
	
	private static int maxNum = 10000; // 몇번까지 구할건지 지정 
	private static boolean[] isselfNum = new boolean[maxNum]; //최대 갯수만큼 배열크기 지정
	
	public static void main(String[] args) throws IOException {
		
		for(int i=1;i <= maxNum; i ++) {
			 int mkself = selfNum(i);
			 
			//구한 값이 범위를 초과하지 않는다면 해당 번호 생성자 있는것으로 간주
			 if(mkself <=maxNum) { 
				 isselfNum[mkself-1] = true;				 
			 }
		}
		//결과 배열에서 뽑아와 셀프넘버면 출력.
		for(int i = 0 ; i < isselfNum.length; i++) {
			if(!isselfNum[i]) {
				System.out.println(i+1);
			} 
		}
	}
	
	//셀프 넘버 구하는 법 
	public static int selfNum(int n) {
		// 만들 번호 넣어줌. 자기 자신 더해야 되니까 그거 넣어준 것.
		int dn = n ;
		
		while(true) {
			// 더 더할 값이 없으면 탈출
			if(n==0) {
				break;
			}
			// 맨 마지막자리 더하기
			dn+= n%10;
			n = n/10 ; 
		}
		return dn;
	}
}
