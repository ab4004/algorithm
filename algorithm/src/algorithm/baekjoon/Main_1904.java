package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1904 {
	public static int[] dp = new int[1000001];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(f(n));
	}

	private static int f(int n) {
		dp[1] = 1;
		dp[2] = 2;
		if (n > 2) {
			for (int i = 3; i <= n; i++) {
				dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
			}
		}
		return dp[n];
	}
}