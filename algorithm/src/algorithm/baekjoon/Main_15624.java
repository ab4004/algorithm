package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main_15624 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		BigInteger[] dp = new BigInteger[1000001];
		
		dp[0] = BigInteger.valueOf(0);
		dp[1] = BigInteger.valueOf(1);
		dp[2] = BigInteger.valueOf(1);
		
		for (int i = 3; i <= n; i++) {
			dp[i] = (dp[i - 1].add(dp[i - 2])).remainder(BigInteger.valueOf(1000000007));
		}
		
		System.out.println(dp[n]);
	}
}