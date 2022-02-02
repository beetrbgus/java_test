package condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//시간 뺄셈 문제
public class B_2884 {
	static final int EARLY = 45;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		String[] arr = n.split(" ");
		int hour = Integer.parseInt(arr[0]);
		int minute = Integer.parseInt(arr[1]);
		br.close();
		
		int earlyMin = minute - EARLY;
		
		if(earlyMin < 0 ){
			hour --;
			earlyMin += 60;
		}
		if(hour < 0 ) {
			hour += 24;
		}
		System.out.println(hour+" "+earlyMin);
	}
}
