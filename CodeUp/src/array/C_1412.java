package array;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class C_1412 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> arr = new TreeMap<>();

		//97-122

		for (int i = 97; i <= 122; i++) {
			char a = (char)i;
			String key = Character.toString(a);

			arr.put(key, 0);
			System.out.println(key);
		}

//		for (int i = 0; i < arr.size(); i++) {
//			String a = Integer.toString(i + 97);
//			System.out.println(arr.toString());
//		}

		sc.close();
	}
}
