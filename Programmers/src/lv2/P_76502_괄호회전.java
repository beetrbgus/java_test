package lv2;

import java.util.Stack;

public class P_76502_괄호회전 {
	public int solution(String s) {
		int answer = 0;
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		
		// 입력 길이만큼 한개씩 괄호 옮기기
		for (int i = 0; i < sb.length(); i++) {
			//맨처음 괄호 뒤로 옮기기 위한 작업
			char a = sb.charAt(0);
			if(i!=0) {
				sb.delete(0, 1);
				sb.append(a);
			}
			
			System.out.println(sb.toString());

			Stack<String> st = new Stack<String>();
			boolean isOk =true;
			//올바른 괄호인지 검사
			for (int j = 0; j < sb.length(); j++) {
				String nowChar = String.valueOf(sb.charAt(j)); //현재의 괄호
				//여는 괄호는 스택에 저장
				if (nowChar.equals("{")|| nowChar.equals("(") || nowChar.equals("[")) {
					st.add(nowChar);
				} else { // 닫는 괄호일 때 stack 에서 제거.
					if (!st.empty()) {
						String close = st.peek();
						if ((close.equals("{")&&nowChar.equals("}"))||(close.equals("(")&&nowChar.equals(")"))||
								(close.equals("[")&&nowChar.equals("]"))) {
							st.pop();
						}
						else{
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
		P_76502_괄호회전 p = new P_76502_괄호회전();
		System.out.println(p.solution("}]()[{"));
	}
}
