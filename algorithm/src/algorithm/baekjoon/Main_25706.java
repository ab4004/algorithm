package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_25706 {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[n + 1];
		int[] dp = new int[400001];
		
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = n; i > 0; i--) {
			if (arr[i] != 0) { // 점프대가 있을 경우
				dp[i] = dp[i + arr[i] + 1] + 1;
			} else {
				dp[i] = dp[i + 1] + 1;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			sb.append(dp[i]).append(" ");
		}
		
		System.out.println(sb);
	}
}