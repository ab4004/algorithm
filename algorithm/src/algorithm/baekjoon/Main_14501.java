package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14501 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] T = new int[n]; // 시간
		int[] P = new int[n]; // 비용
		int[] dp = new int[n + 1];
		StringTokenizer st = null;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			T[i] = Integer.parseInt(st.nextToken());
			P[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < n; i++) {
			if (i + T[i] <= n) {
				dp[i + T[i]] = Math.max(dp[i + T[i]], dp[i] + P[i]);
			}
			
			dp[i + 1] = Math.max(dp[i + 1], dp[i]);
		}
		
		System.out.println(dp[n]);
	}
}