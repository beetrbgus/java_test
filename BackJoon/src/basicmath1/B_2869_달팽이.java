package basicmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 품
public class B_2869_달팽이 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine()," ");
		br.close();
		int a = Integer.parseInt(st.nextToken()); //올라감
		int b = Integer.parseInt(st.nextToken()); //미끄러짐
		int v = Integer.parseInt(st.nextToken()); //높이
		// 첫 날에 v가 a보다 작으면 1일로 끝임. 내려가는건 없음
		// 다시 말해서 애초에 높이에서 내려가는걸 빼고 생각해야 함.
		
		int day = (v-b)/(a-b);
		if((v-b)%(a-b)!=0) day+=1;
		System.out.println(day);
	}
}
