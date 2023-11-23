package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2156 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[] arr = new int[10001];
		int[] dp = new int[10001];
		
		for (int i = 1; i <= t; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp[1] = arr[1];
		dp[2] = dp[1] + arr[2];
		dp[3] = Math.max(Math.max(arr[1] + arr[3], arr[2] + arr[3]), arr[1] + arr[2]);
		
		for (int i = 4; i < arr.length; i++) {
			dp[i] = Math.max(Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]), dp[i - 4] + arr[i - 2] + arr[i - 1]);
		}
		
		System.out.println(dp[t]);
	}
}