package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15650 {
	static int n;
	static int m;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		
		dfs(1, 0);
		
		System.out.println(sb);
	}
	
	static void dfs(int start, int depth) {
		if (depth == m) {
			for (int i : arr)
				sb.append(i).append(" ");
			sb.append("\n");
			return;
		}
		
		for (int i = start; i <= n; i++) {
			arr[depth] = i;
			dfs(i + 1, depth + 1);
		}
	}
}