package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_10773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<Integer>();
		
		for (int i = 0; i < k; i++) {
			int d = Integer.parseInt(br.readLine());
			if (d == 0) 
				st.pop();
			else
				st.push(d);
		}
		
		int sum = 0;
		while (!st.isEmpty()) {
			sum += st.pop();
		}
		
		System.out.println(sum);
	}
}