package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1463 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[1000001];
		
		dp[2] = dp[3] = 1;
		
		for (int i = 4; i <= n; i++) {
			dp[i] = dp[i - 1] + 1;
			
			if (i % 6 == 0) // 만약 6으로 나눠질 경우 3으로 나눈 값과 2로 나눈 값을 비교
				dp[i] = Math.min(dp[i / 3], dp[i / 2]) + 1;
			else if (i % 3 == 0)
				dp[i] = Math.min(dp[i / 3] + 1, dp[i]);
			else if (i % 2 == 0)
				dp[i] = Math.min(dp[i / 2] + 1, dp[i]);
		}
		
		System.out.println(dp[n]);
	}
}