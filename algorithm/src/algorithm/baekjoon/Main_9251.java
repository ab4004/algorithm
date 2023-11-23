package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9251 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str_a = br.readLine();
		String str_b = br.readLine();
		int[][] dp = new int[str_a.length() + 1][str_b.length() + 1];
		int max = 0;
		for (int i = 1; i <= str_a.length(); i++) {
			for (int j = 1; j <= str_b.length(); j++) {
				if (str_a.charAt(i - 1) == str_b.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
				
				max = Math.max(max, dp[i][j]);
			}
		}
		
		System.out.println(max);
	}
}
