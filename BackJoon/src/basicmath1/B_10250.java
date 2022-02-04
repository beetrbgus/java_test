package basicmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//호텔 방 배정
public class B_10250 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine()); //올라감
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
			if(n<=h) { // n번째 손님이 층수랑 같아지면 멈추게
				break;
			}
			n-=h; // n번째 고객에서 층수를 계속 빼면 호수가 증가해요
			ho++;
		}
		if(ho<10) roomNumber = n+"0"+ho; 
		else roomNumber = String.valueOf(n)+String.valueOf(ho);
		return roomNumber;
	}
}
