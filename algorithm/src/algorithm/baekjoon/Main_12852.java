package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_12852 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n + 1]; // 이동 경로 저장
		int[] dp = new int[n + 1]; // 횟수 최솟값 저장
		
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + 1;
			arr[i] = i - 1;
			
			if (i % 3 == 0 && dp[i / 3] + 1 < dp[i]) {
				dp[i] = dp[i / 3] + 1;
				arr[i] = i / 3;
			} 
			
			if (i % 2 == 0 && dp[i / 2] + 1 < dp[i]) {
				dp[i] = dp[i / 2] + 1;
				arr[i] = i / 2;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(dp[n]).append("\n");
		
		while (n > 0) {
			sb.append(n).append(" ");
			n = arr[n];
		}
		
		System.out.println(sb);
	}
}
