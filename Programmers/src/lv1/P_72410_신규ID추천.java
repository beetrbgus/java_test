package lv1;

public class P_72410_신규ID추천 {
	public static void main(String args[]) {
		P_72410_신규ID추천 p = new P_72410_신규ID추천();
		System.out.println(p.solution("=.="));
	}

	public String solution(String new_id) {
		StringBuilder sb = new StringBuilder();
		// 1단계 : 대문자 -> 소문자로 치환
		new_id = new_id.toLowerCase(); 
		char[] idArr = new_id.toCharArray(); // 2단계를 위한 배열 생성
		
		// 2단계 : 소문자,숫자 , - _ . 면 추가 아니면 sb에 추가하지 않음.
		for (int i = 0; i < idArr.length; i++) {
			if ((idArr[i] >= 48 && idArr[i] <= 57)||(idArr[i] >= 97 && idArr[i] <= 122) 
					|| idArr[i] == 45 || idArr[i] == 46 || idArr[i] == 95) {
				sb.append(idArr[i]);
			}
		}
		//3단계 여러개의 .을 합치기
		String thirdStr = sb.toString().replaceAll("\\.+", ".");
		sb.delete(0, sb.length());
		sb.append(thirdStr);
		//4단계 : 맨 앞 맨 뒤 마침표 제거
		sb = fourth(sb);
		//5단계 : 공백에 문자 대입
		if (sb.toString().equals("")) sb.append("a");
		//6단계 : 16자 이상이면 15자 제외 제거 후 끝에 위치한 . 제거
		if (sb.length() >= 16) {
			sb.delete(15, sb.length());
			sb = fourth(sb); //맨 앞뒤 마침표 제거
		}
		//7단계 : 2자 이하 마지막 문자 반복
		if (sb.length() <= 2) {
			while (sb.length() < 3) {
				sb.append(sb.toString().substring(sb.length() - 1, sb.length()));
			}
		}
		return sb.toString();
	}
	public static StringBuilder fourth(StringBuilder sb) {
		//4단계 : 맨 앞 맨 뒤 마침표 제거
		if(sb.charAt(0)=='.')sb.delete(0, 1);
		if(!sb.toString().equals("") &&sb.charAt(sb.length()-1)=='.')sb.delete(sb.length()-1, sb.length());
		return sb;	
	}
}
