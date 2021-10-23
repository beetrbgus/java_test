package whileexam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1110 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			br.close();
			
			int init = n;
			int cycle = 0;
			
			while (true) {
				int first = n / 10;
				int second = n % 10;
				int result = first + second;

				n = second * 10 + result % 10;

				cycle++;
				if (init == n) {
					break;
				}

			}
			System.out.println(cycle);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
