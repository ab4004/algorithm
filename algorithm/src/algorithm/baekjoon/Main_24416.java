package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_24416 {
	public static int[] dp = null;
	public static int count = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new int[n + 1];
		
		fibo(n); // 재귀함수 호출
		System.out.print(count + " ");
		
		count = 0;
		
		fiboDP(n); // 동적프로그래밍 호출
		System.out.print(count);
	}
	
	private static int fibo(int n) {
		if (n < 3) {
			count++;
			return 1;
		}
		return fibo(n - 1) + fibo(n - 2);
	}
	
	private static int fiboDP(int n) {
		dp[1] = 1;
		dp[2] = 1;
		for (int i = 3; i <= n; i++) {
			count++;
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}
}
