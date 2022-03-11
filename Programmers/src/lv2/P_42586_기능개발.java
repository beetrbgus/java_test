package lv2;

import java.util.ArrayList;
import java.util.List;

public class P_42586_기능개발 {
    public static int[] solution(int[] progresses, int[] speeds) {
        
        int[] result = new int[progresses.length];
        //생각 - 일단 각 작업의 작업 일 수를 구하고, 작업 일 수를 비교하기. 
        for(int i=0; i< progresses.length;i++) {
        	int remainPercent = 100-(progresses[i]+speeds[i]);//1일차에는 1일차 작업속도도 포함. 
        	if( remainPercent <0) result[i]=1; //1일차에 작업률 다 채우면 i번째 1로 반환
        	else{
        		if(remainPercent%speeds[i]==0) result[i]= 1+remainPercent/speeds[i]; //잔업이 안남는다면 1일 추가
        		else result[i]=2+(remainPercent/speeds[i]); //잔업 남으면 2일 추가
        	}
        }
        List<Integer> arr = new ArrayList<>();
        //일 수 구해서 answer 배열의 길이 구하기.
        //작업 일 수는 앞전 것보다 오래걸리는 작업이 나오면 일수 증가.
    	int longDay = result[0];//작업일 수 높은 것 
        int day = 0;
        int work = 0;
        for(int i=0; i< result.length;i++) {
        	if(longDay<result[i]) {
        		longDay = result[i];
        		day++;
        		arr.add(work);
        		work=1;
        	}else {
        		work++;
        	}
        }
        arr.add(work);//마지막 남은 work 갯수 추가
        
        int[] answer = new int[arr.size()];
        
        for(int i=0; i< arr.size();i++) {
    		answer[i] = arr.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
//    	int[] progresses =  {93,30,55};95, 90, 99, 99, 80, 99
    	int[] progresses =  {95, 90, 99, 99, 80, 99};
    	int[] speeds = {1, 1, 1, 1, 1, 1};
    	int[] result = solution(progresses,speeds);
    	for(int a : result) {
    		System.out.print(a+" ");
    	}
    }
}
