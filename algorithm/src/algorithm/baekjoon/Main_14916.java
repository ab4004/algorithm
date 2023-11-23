package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_14916 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int min = Integer.MAX_VALUE;
		
		// 그리디 방식
		for (int i = 0; i <= n / 2; i++) {
			for (int j = 0; j <= n / 5; j++) {
				if ((n - (i * 2) - (j * 5)) == 0)
					min = Math.min(min, i + j);
			}
		}
		
		if (min == Integer.MAX_VALUE)
			System.out.println(-1);
		else
			System.out.println(min);
		
		// dp 방식(bottom_up)
		int[] dp = new int[100001];
		Arrays.fill(dp, Integer.MAX_VALUE);
		
		dp[2] = dp[5] = 1;
		dp[4] = 2;
		
		for (int i = 6; i < 100001; i++) {
			dp[i] = Math.min(dp[i - 2], dp[i - 5]) + 1;
		}
		
		System.out.println(dp[n] == Integer.MAX_VALUE ? -1 : dp[n]);
	}
}