package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10211 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			int[] dp = new int[n];
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			dp[0] = arr[0];
			int max = arr[0];
			
			for (int j = 1; j < n; j++) {
				dp[j] = Math.max(arr[j], dp[j - 1] + arr[j]);
				max = Math.max(max, dp[j]);
			}
			
			sb.append(max).append("\n");
		}
		
		System.out.println(sb);
	}
}