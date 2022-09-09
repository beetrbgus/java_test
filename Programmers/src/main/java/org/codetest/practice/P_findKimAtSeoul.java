package org.codetest.practice;

// 서울에서 김서방 찾기
public class P_findKimAtSeoul {
    public String solution(String[] seoul) {
        String answer = "Kim";
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0; i < seoul.length; i++ ) {
            if(seoul[i].equals(answer)) {
                stringBuilder.append("김서방은 "+ i +"에 있다");
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String args[]) {
        P_findKimAtSeoul question = new P_findKimAtSeoul();
        String argument[] = {"Jane", "Kim"};
        System.out.println(question.solution(argument));;
    }
}