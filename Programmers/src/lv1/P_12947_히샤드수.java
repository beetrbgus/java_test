package lv1;

public class P_12947_히샤드수 {
    public boolean solution(int x) {
        boolean answer = false;
        int sum=0;
        int copy = x;
        while(copy!=0){
            sum+=copy%10;
            copy/=10;
        }
        if(x%sum ==0) answer = true;
        
        return answer;
    }
    public static void main(String[] args){
    	P_12947_히샤드수 p = new P_12947_히샤드수();
    	
    	System.out.println(p.solution(10));
    }
}
