package data_Sort;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class C_1451 {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			arr.add(a);
		}
		int temp ;  
		for(int i = 1 ; i < arr.size() ; i ++) {
			
			for(int j = i ; j  > 0 ; j -- ) {
				if(arr.get(j) < arr.get(j-1)) {
					temp = arr.get(j);
					arr.set(j, arr.get(j-1));
					arr.set(j-1, temp);
				}
			}
		}
		sc.close();
		for(int a : arr) {
			System.out.println(a);
		}
	}
}
