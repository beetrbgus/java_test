package org.codetest.lv2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class P_76502_BracketRotation2 {
	public int solution(String s) {
		int answer = 0;
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		//해당 짝끼리의 차를 0으로 만들어 값으로 비교 - if문 조건 너무 많아져서 사용하려고 함.
		Map<String,Integer> arr =new HashMap<>();
		arr.put("{", 10); arr.put("}", 10);
		arr.put("(", 20); arr.put(")", 20);
		arr.put("[", 30); arr.put("]", 30);
		// 입력 길이만큼 한개씩 괄호 옮기기
		for (int i = 0; i < sb.length(); i++) {
			//맨처음 괄호 뒤로 옮기기 위한 작업
			char a = sb.charAt(0);
			if(i!=0) {
				sb.delete(0, 1);
				sb.append(a);
			}
			//System.out.println(sb.toString());

			Stack<String> st = new Stack<String>();
			boolean isOk =true;
			//올바른 괄호인지 검사
			for (int j = 0; j < sb.length(); j++) {
				String nowChar = String.valueOf(sb.charAt(j)); //현재의 괄호
				//여는 괄호는 스택에 저장
				if (nowChar.equals("{")|| nowChar.equals("(") || nowChar.equals("[")) {
					st.add(nowChar);
				} else { // 닫는 괄호일 때 st에서 제거 + 값비교로 올바른 괄호 판단
					if (!st.empty()) {
						if(arr.get(nowChar) - arr.get(st.pop())!=0) {
							isOk=false;
							break;
						}
					}else {
						isOk=false;
						break;
					}
				}
			}
			if(st.empty()&&isOk) answer++;
		}
		return answer;
	}

	public static void main(String args[]) {
		P_76502_BracketRotation2 p = new P_76502_BracketRotation2();
		System.out.println(p.solution("}]()[{"));
	}
}
