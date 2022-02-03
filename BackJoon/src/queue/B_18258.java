package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 18258번 Queue 구현 문제 
public class B_18258 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int arrMany = Integer.parseInt(input);
		Queue que = new Queue(arrMany);
		que.push(0);
	}

}

class Queue {
	private int[] queue;
	private int pointer=0;
	Queue() {

	}
	Queue(int arrNum) {
		queue = new int[arrNum];
	}

	public void push(int num)  {
		queue[pointer] = num;
		pointer++;
		System.out.println("pointer   "+pointer);
	}
	public void pop(int num)  {
		queue[pointer] = num;
		pointer++;
		System.out.println("pointer   "+pointer);
	}
	
}