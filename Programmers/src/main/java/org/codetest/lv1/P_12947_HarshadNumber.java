package org.codetest.lv1;

public class P_12947_HarshadNumber {
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
    	P_12947_HarshadNumber p = new P_12947_HarshadNumber();
    	
    	System.out.println(p.solution(10));
    }
}