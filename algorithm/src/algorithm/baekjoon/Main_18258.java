package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_18258 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<Integer>();
		int last = 0;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			if (st.countTokens() > 1) {
				st.nextToken();
				last = Integer.parseInt(st.nextToken());
				q.add(last);
			} else {
				switch(st.nextToken()) {
				case "pop":
					if (q.isEmpty()) {
						sb.append(-1).append("\n");
					} else {
						sb.append(q.remove()).append("\n");
					}
					break;
					
				case "size":
					sb.append(q.size()).append("\n");
					break;
					
				case "empty":
					if (q.isEmpty()) {
						sb.append(1).append("\n");
					} else {
						sb.append(0).append("\n");
					}
					break;
					
				case "front":
					if (q.isEmpty()) {
						sb.append(-1).append("\n");
					} else {
						sb.append(q.peek()).append("\n");
					}
					break;
					
				case "back":
					if (q.isEmpty()) {
						sb.append(-1).append("\n");
					} else {
						sb.append(last).append("\n");
					}
					break;
				}
			}
		}
		
		System.out.println(sb);
	}
}
