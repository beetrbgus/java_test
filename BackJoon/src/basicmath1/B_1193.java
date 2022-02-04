package basicmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//분수 찾기
public class B_1193 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 단 : 1 , 3 단 =  n/1 시작
		// 단 : 2 , 4 단 =  1/n
		// 1 - 1/1 (x+y) = 2 
		// 2 - 1/2 (x+y) = 3 (x+1 , y -1)
		// 3 - 2/1 
		// 4 - 3/1 (x+y) = 4 (x-1 , y +1)
		// 5 - 2/2
		// 6 - 1/3
		// 7 - 1/4
		// 8 - 2/3
		// 9 - 3/2
		//10 - 4/1
		int t = Integer.parseInt(br.readLine()); //올라감
		if(t==1) System.out.println(1/1);
		for(int i=0;i<t;i++) {
			StringTokenizer st =new StringTokenizer(br.readLine()," ");
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			System.out.println(getRoomNumber(h,w,n));
		}
		br.close();
	}
	public static String getRoomNumber(int h,int w,int n) {
		//h : 층 수  w : 방 수 n : 손님 몇번째인지
		String roomNumber="";
		int ho = 1;
		while(true) {
			if(n<=h) {
				break;
			}
			n-=h;
			ho++;
		}
		if(ho<10) roomNumber = n+"0"+ho;
		else roomNumber = String.valueOf(n)+String.valueOf(ho);
		
		return roomNumber;
	}
}
