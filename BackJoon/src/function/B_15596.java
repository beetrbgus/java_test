package function;

public class B_15596 {
	//정수 배열 주어질 때 모든 요소의 합계 구하는 함수 
	
	private static int min = 0;//범위의 최소값 지정
	private static int limit = 3000000;//범위의 최대값 지정

	public static void main(String args[]) {
		//예시 배열
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		sum(arr);
	}
	
	public static long sum(int[] a) {
		long result = 0 ; 
		if (a.length >= min && a.length <= limit) {
			for(int element : a ) {
				result += element;
			}
		}
		return result;
	}
}
