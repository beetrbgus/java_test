package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

public class B_9012_gualho {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());// 테스트 케이스 갯수
		for (int i = 0; i < t; i++) {
			String testCase = br.readLine();
			System.out.println(isGual(testCase));
		}
		br.close();
	}

	public static String isGual(String testCase) {
		Stack<String> open = new Stack<String>();// 여는 괄호 담을 stack
		if (testCase.length() % 2 != 0)
			return "NO"; // 테스트케이스 길이 홀수= 맞을리가 없음.
		for (int i = 0; i < testCase.length(); i++) {
			if (testCase.charAt(i) == '(') { // 여는 괄호면 stack에 추가.
				open.push("(");
			} else if (testCase.charAt(i) == ')') { // 닫는 괄호 나오면 맨 위의 ( 제거 = 쌍 맞아서 지움.
				try {
					open.pop();
				} catch (EmptyStackException e) { // 닫는 괄호 갯수가 더 많으면 VPS가 아님.
					return "NO";
				}
			}
		}
		if (open.size() == 0)return "YES";
		else return "NO";
	}
}