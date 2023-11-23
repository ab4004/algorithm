package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1717 {
	static int[] parent = null;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		parent = new int[n + 1];
		
		for (int i = 0; i <= n; i++) 
			parent[i] = i;
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int check = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if (check == 0) {
				Union(a, b);
			} else {
				if (isUnion(a, b)) {
					sb.append("YES").append("\n");
				} else {
					sb.append("NO").append("\n");
				}
			}
		}
		
		System.out.println(sb);
	}

	static void Union(int a, int b) {
		a = Find(a);
		b = Find(b);
		
		if (a == b) return;
		
		if (a < b) {
			parent[b] = a;
		} else {
			parent[a] = b;
		}
	}
	
	static int Find(int value) {
		if (parent[value] == value)
			return value;
		return parent[value] = Find(parent[value]);
	}
	
	static boolean isUnion(int a, int b) {
		a = Find(a);
		b = Find(b);
		
		return (a == b);
	}
}
