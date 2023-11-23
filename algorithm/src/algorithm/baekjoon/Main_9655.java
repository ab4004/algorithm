package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9655 {
	static Integer[] dp = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		// 홀짝을 이용한 풀이
		if (n % 2 == 0)
			System.out.println("CY");
		else
			System.out.println("SK");
		
		// DP를 이용한 풀이
		dp = new Integer[n + 1];
		
		if (play(n) % 2 == 0)
			System.out.println("CY");
		else
			System.out.println("SK");
	}
	
	private static int play(int n) {
		if (n < 3)
			return dp[n] = n;
		
		if (dp[n] == null)
			dp[n] = Math.min(play(n - 1) + 1, play(n - 3) + 1);
		
		return dp[n];
	}
}
