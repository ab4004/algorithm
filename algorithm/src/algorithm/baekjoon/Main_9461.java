package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9461 {
	public static long[] dp = new long[101];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		dp[1] = 1; dp[2] = 1; dp[3] = 1; dp[4] = 2; dp[5] = 2;
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			sb.append(f(n)).append("\n");
		}
		System.out.println(sb);
	}
	
	private static long f(int n) {
		if (dp[n] != 0) return dp[n];
		for (int i = 6; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 5];
		}
		return dp[n];
	}
}