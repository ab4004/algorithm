package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_15654 {
	static int n;
	static int m;
	static int[] arr;
	static int[] list;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		list = new int[n];
		visited = new boolean[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) 
			list[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(list);
		
		dfs(0);
		
		System.out.println(sb);
	}
	
	static void dfs(int depth) {
		if (depth == m) {
			for (int i : arr) 
				sb.append(i).append(" ");
			sb.append("\n");
			return;
		}
		
		for (int i = 0; i < list.length; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[depth] = list[i];
				dfs(depth + 1);
				visited[i] = false;
			}
		}
	}
}
