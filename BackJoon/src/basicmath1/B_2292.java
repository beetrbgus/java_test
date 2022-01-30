package basicmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2292 {

	
	public static void main(String args[]) throws IOException {
		   
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int inputNum  = Integer.parseInt(input);
		int cnt = passedRoom(inputNum);
		System.out.println(cnt);
		br.close();
		
	}
	public static int passedRoom(int inputNum) {
		int room = 1; //몇번째 단계의 방인지
		int roomcnt = 1; //방의 총 갯수
		
		if(inputNum != 1) {  // 입력 값이 1이면 1만 던져주면 됨
			
			while(roomcnt >= inputNum) { //총 지나간 방의 갯수가 입력된 갯수보다 크면 멈춤
				roomcnt += 6 * room; 
				room++;
			}
		}
		return room; 
		
	}
}
