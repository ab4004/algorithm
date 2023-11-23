package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_13699 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] dp = new long[36];
		dp[0] = dp[1] = 1;
		dp[2] = 2;
		dp[3] = 5;
		dp[4] = 14;

		for (int i = 5; i < 36; i++) {
			for (int j = 0; j < i; j++) {
				dp[i] += (dp[j] * dp[i - j - 1]);
			}
		}
		 
		System.out.println(dp[n]);
	}
}