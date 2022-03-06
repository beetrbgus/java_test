package lv1;

public class P_12977_소수만들기 {
	public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length;
        int a=0, b=1,c=2;
        
        while(true){
             int numA = nums[a],numB = nums[b],numC = nums[c];
             int sum =numA+numB+numC;
             boolean isPrime = true;
             for(int i=2;i<sum;i++) {
            	 if(sum%i==0) {
            		isPrime = false;
            		break;
            	 }
             }
             if(isPrime)answer++;
             //끝나면 c를 1 증가시켜준다.
             //만약 c가 배열의 길이와 같다면 b를 1증가시키고 c는 b다음 숫자로.
             //만약 b가 배열의 길이-1과 같다면 a 증가시키고 b,c는 다시 초기화
             c++;
                          
             if(c>=len) {
            	 b++;
            	 c=b+1;
            	 if(b>=len-1) {
            		 a++;
            		 b=a+1;
            		 c=b+1;
            		 
            		 if(a>=len-2) {
            			 break; 
            		 } 
            	 }
             }
        }
        return answer;
    }
	public static void main(String[] args) {
		P_12977_소수만들기 p = new P_12977_소수만들기();
		int[] arr = {1,2,7,6,4};
		System.out.println(p.solution(arr));
	}
}
