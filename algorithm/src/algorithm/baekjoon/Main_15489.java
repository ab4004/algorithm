package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15489 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		int[][] dp = new int[31][31];
		dp[1][1] = dp[2][1] = dp[2][2] = 1;
		
		for (int i = 3; i < 31; i++) {
			for (int j = 1; j <= i; j++) {
				dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
			}
		}
		
		int sum = 0;
		int cnt = 0;
		
		for (int i = r + w - 1; i >= r; i--) { // 시작줄 r부터 w - 1줄 까지
			for (int j = c + w - cnt - 1; j >= c; j--) {
				sum += dp[i][j];
			}
			cnt++;
		}
		
		System.out.println(sum);
	}
}