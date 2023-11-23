package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main_11057 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		BigInteger[][] dp = new BigInteger[1001][10];
		
		for (int i = 0; i < 10; i++) {
			dp[2][i] = BigInteger.valueOf(10 - i);
		}

		BigInteger cnt = BigInteger.valueOf(55);
		for (int i = 3; i <= n; i++) {
			dp[i][0] = cnt;
			for (int j = 1; j < 10; j++) {
				dp[i][j] = dp[i][j - 1].subtract(dp[i - 1][j - 1]);
				cnt = cnt.add(dp[i][j]);
			}
		}
		
		if (n == 1)
			cnt = BigInteger.valueOf(10);

		System.out.println(cnt.remainder(BigInteger.valueOf(10007)));
	}
}