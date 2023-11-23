package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n + 1];
		int[] dp = new int[n + 1];
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i < n + 1; i++) 
			arr[i] = Integer.parseInt(st.nextToken());
		
		dp[1] = arr[1];
		
		for (int i = 2; i < n + 1; i++) 
			dp[i] = arr[i] + dp[i - 1];
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int start = Integer.parseInt(st.nextToken()) - 1;
			int end = Integer.parseInt(st.nextToken());
			
			sb.append(dp[end] - dp[start]).append("\n");
		}
		
		System.out.println(sb);
	}
}