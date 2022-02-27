package brouteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 여러분은 입력에 나열된 사람의 덩치 등수를 구해서 그 순서대로 첫 줄에 출력해야 한다.
// 단, 각 덩치 등수는 공백문자로 분리되어야 한다.
public class B_7568_Dungchi {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[]) throws IOException {
		
		int input = Integer.parseInt(br.readLine());
		
		int[][] peopleArr = new int[input][2];
		for(int i=0;i<peopleArr.length;i++) {
			String[] profile = br.readLine().split(" "); 
			peopleArr[i][0]= Integer.parseInt(profile[0]);
			peopleArr[i][1]= Integer.parseInt(profile[1]);
		 }
		make_boonhae(peopleArr);
	}
	

	public static void make_boonhae(int[][] peopleArr) {
		for (int i = 0; i < peopleArr.length; i++) {
			int rank =1;
			
			for (int j = 0; j < peopleArr.length; j++) {
				if(i==j)continue;// 비교 대상이 자기 자신일 때는 패스
				//몸무게와 키 모두 다른 사람이 크면 등수 뒤로 밀려남
				if(peopleArr[i][0]<peopleArr[j][0]&&
				   peopleArr[i][1]<peopleArr[j][1]) {
					rank++;
				}
			}
			System.out.print(rank+" ");
		} 
	}
}
