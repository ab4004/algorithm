package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_9252 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

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

		sb.append(max).append("\n");

		Stack<Character> st = new Stack<Character>();

		int i = str_a.length();
		int j = str_b.length();

		while (i > 0 && j > 0) {
			if (dp[i][j] == dp[i - 1][j]) {
				i--;
			} else if (dp[i][j] == dp[i][j - 1]) {
				j--;
			} else {
				st.push(str_a.charAt(i - 1));
				i--;
				j--;
			}

		}

		while (!st.isEmpty())
			sb.append(st.pop());

		System.out.println(sb);
	}
}
