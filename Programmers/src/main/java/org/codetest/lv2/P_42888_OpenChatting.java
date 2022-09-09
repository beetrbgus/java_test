package org.codetest.lv2;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// 오픈채팅방
public class P_42888_OpenChatting {

	static Map<String, String> idMap = new HashMap<String, String>();

	public static void main(String args[]) throws IOException {
		String[] input = { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
				"Change uid4567 Ryan" };
		solution(input);
	}

	public static String[] solution(String[] record) {

		String[] answerfirst = new String[record.length];//5 -> 4 
		String[] commandArr = { "님이 들어왔습니다.", "님이 나갔습니다." };
		int point = 0;

		for (int i = 0; i < record.length; i++) {
			String[] first = record[i].split(" ");

			switch (first[0]) {
			case "Enter":
				enter(first[1], first[2]);
				answerfirst[point] = first[1] + " " + commandArr[0];
				point++;
				break;
			case "Change":
				enter(first[1], first[2]);
				break;
			case "Leave":
				answerfirst[point] = first[1] + " " + commandArr[1];
				point++;
				break;
			}

		}
		String[] answer = new String[point];
		for (int i = 0; i < point; i++) {
			answer[i] = answerfirst[i].replace(answerfirst[i].split(" ")[0], idMap.get(answerfirst[i].split(" ")[0]))
					.replaceFirst(" ", "");
			System.out.println(answer[i]);
		}
		return answer;
	}

	public static void enter(String id, String nick) {
		idMap.put(id, nick);
	}

}
