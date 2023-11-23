package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10844 {
	final static int MOD = 1000000000;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		long[][] dp = new long[n + 1][10]; // [자릿수][0~9까지]
		
		for (int i = 1; i < 10; i++) { // 1번째 자릿수는 경우의 수가 하나 밖에 없음
			dp[1][i] = 1;
		}
		
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 0) { // 자릿값이 0이면 이전 자릿수의 첫번째 자릿수
					dp[i][0] = dp[i - 1][1] % MOD;
				} else if (j == 9) { // 자릿값이 9면 이전 자릿수는 8
					dp[i][9] = dp[i - 1][8] % MOD;
				} else {
					dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % MOD;
				}
			}
		}
		
		long result = 0;
		
		for (int i = 0; i < 10; i++) {
			result += dp[n][i];
		}
		
		System.out.println(result % MOD);
	}
}