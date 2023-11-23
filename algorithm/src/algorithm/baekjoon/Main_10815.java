package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main_10815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
				
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		HashSet<Integer> cards = new HashSet<>();
		
		for (int i = 0; i < n; i++) {
			cards.add(Integer.parseInt(st.nextToken()));
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < m; i++) {
			if (cards.contains(Integer.parseInt(st.nextToken()))) {
				sb.append(1).append(" ");
			} else {
				sb.append(0).append(" ");
			}
		}
		
		System.out.println(sb);
	}
}