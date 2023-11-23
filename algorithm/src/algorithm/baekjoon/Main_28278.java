package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_28278 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			if (st.countTokens() > 1) {
				st.nextToken();
				stack.push(Integer.parseInt(st.nextToken()));
			} else {
				switch(Integer.parseInt(st.nextToken())) {
				case 2:
					if (stack.isEmpty()) {
						sb.append(-1).append("\n");
					} else {
						sb.append(stack.pop()).append("\n");
					}
					break;
					
				case 3:
					sb.append(stack.size()).append("\n");
					break;
					
				case 4:
					if (stack.isEmpty()) {
						sb.append(1).append("\n");
					} else {
						sb.append(0).append("\n");
					}
					break;
					
				case 5:
					if (stack.isEmpty()) {
						sb.append(-1).append("\n");
					} else {
						sb.append(stack.peek()).append("\n");
					}
					break;
				}
			}
		}
		System.out.println(sb);
	}
}