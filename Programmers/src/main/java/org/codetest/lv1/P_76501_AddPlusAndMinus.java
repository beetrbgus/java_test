package org.codetest.lv1;

//P_76501_음양더하기
public class P_76501_AddPlusAndMinus {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i=0;i<absolutes.length;i++){
            
            if(!signs[i]) absolutes[i]= -absolutes[i];
            answer+= absolutes[i];
        }
        
        return answer;
    }
}
