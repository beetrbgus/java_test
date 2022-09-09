package org.codetest.lv2;

// 기능개발2
public class P_42586_FunctionDevelopment2 {
    public static int[] solution(int[] progresses, int[] speeds) {
        
        int[] result = new int[progresses.length];
        //생각 - 일단 각 작업의 작업 일 수를 구하고, 작업 일 수를 비교하기. 
        int day = 0; // 총 작업 일 수
        int longDayOrigin = 0;
        for(int i=0; i< progresses.length;i++) {
        	int remainPercent = 100-(progresses[i]+speeds[i]);//1일차에는 1일차 작업속도도 포함. 
        	if( remainPercent <0) result[i]=1; //1일차에 작업률 다 채우면 i번째 1로 반환
        	else{
        		if(remainPercent%speeds[i]==0) {
        			result[i]= 1+remainPercent/speeds[i]; //잔업이 안남는다면 1일 추가
        		} 
        		else result[i]=2+(remainPercent/speeds[i]); //잔업 남으면 2일 추가
        		//걸리는 작업일이 기존의 최고로 오래걸리는 일 수보다 크면 
        		//걸리는 날짜가 늘어남 , 최고로 오래걸리는 일 갱신
        		if(result[i] > longDayOrigin) { 
        			day++; 
        			longDayOrigin = result[i];
        		}
        	}
        }
        System.out.println("총 걸리는 날짜 : "+day);
        
        int[] answer = new int[day]; // 정답 배열의 갯수
        int ansertIndex = 0;
        //일 수 구해서 answer 배열의 길이 구하기.
        //작업 일 수는 앞전 것보다 오래걸리는 작업이 나오면 일수 증가.
    	int longDay = result[0];//작업일 수 높은 것 
        
        int work = 0;
        for(int i=0; i< result.length;i++) {
        	//현재 항목이 지금까지 중 가장 오래 걸리는 일 수면 
        	if(longDay<result[i]) {
        		//해당 날짜에 끝내는 작업 갯수 넣기
        		answer[ansertIndex] = work;
        		ansertIndex++;
        		
        		longDay = result[i];
        		day++;
        		
        		work=1;
        	}else {
        		work++;
        	}
        }
        answer[ansertIndex]= work;//마지막 남은 work 갯수 추가

        return answer;
    }
    public static void main(String[] args) {
//    	int[] progresses =  {93,30,55};
    	int[] progresses =  {95, 90, 99, 99, 80, 99};
    	int[] speeds = {1, 1, 1, 1, 1, 1};
    	int[] result = solution(progresses,speeds);
    	
    	for(int a : result) {
    		System.out.print(a+" ");
    	}
    }
}
