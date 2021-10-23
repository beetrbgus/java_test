package whileexam;

import java.io.IOException;
import java.util.Scanner;

public class B_10951 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Scanner sc = new Scanner(System.in);
			while (sc.hasNextInt()) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				System.out.println(a+b);
				if(a ==0 || b==0) break;
			}
			sc.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
