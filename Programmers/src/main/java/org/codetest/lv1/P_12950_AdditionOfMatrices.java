package org.codetest.lv1;

// 행렬의 덧셈
public class P_12950_AdditionOfMatrices {
    public int[][] solution(int[][] arr1, int[][] arr2) {
    	// 래기드 배열이 아니란 전제하에 arr1의 길이와 arr[0]번째 길이로 초기화
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
    public static void main(String[] args){
    	P_12950_AdditionOfMatrices p = new P_12950_AdditionOfMatrices();
    	int arr1[][] = {{1,2},{2,3}};
    	int arr2[][] = {{3,4},{5,6}};
    	p.solution(arr1, arr2);
    }

}
