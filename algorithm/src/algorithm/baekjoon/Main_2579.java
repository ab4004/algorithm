package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2579 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		int[] arr = new int[t + 1];
		int[] dp = new int[t + 1];

		for (int i = 1; i <= t; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		dp[1] = arr[1];
		
		if (t >= 2) 
			dp[2] = arr[1] + arr[2];
		
		for (int i = 3; i <= t; i++) {
			dp[i] = Math.max(dp[i - 3] + arr[i - 1], dp[i - 2]) + arr[i];
		}
		
		System.out.println(dp[t]);
	}
}