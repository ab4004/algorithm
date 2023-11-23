package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_15657 {
	static int n;
	static int m;
	static int[] arr;
	static int[] list;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		list = new int[n + 1];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 1; i <= n; i++) 
			list[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(list);
		
		dfs(1, 0);
		
		System.out.println(sb);
	}
	
	static void dfs(int at, int depth) {
		if (depth == m) {
			for (int i : arr) 
				sb.append(i).append(" ");
			sb.append("\n");
			return;
		}
		
		for (int i = at; i <= n; i++) {
			arr[depth] = list[i];
			dfs(i, depth + 1);
		}
	}
}