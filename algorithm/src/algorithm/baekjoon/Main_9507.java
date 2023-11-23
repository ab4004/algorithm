package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main_9507 {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		BigInteger[] dp = new BigInteger[68];
		
		dp[0] = dp[1] = BigInteger.valueOf(1);
		dp[2] = BigInteger.valueOf(2);
		dp[3] = BigInteger.valueOf(4);
		
		for (int i = 4; i < dp.length; i++) {
			dp[i] = dp[i - 1].add(dp[i - 2]).add(dp[i - 3]).add(dp[i - 4]);
		}
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(dp[n]).append("\n");
		}
		
		System.out.println(sb);
	}
}