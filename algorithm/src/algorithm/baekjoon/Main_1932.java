package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1932 {
	static int[][] arr = null;
	static Integer[][] dp = null; // 래핑클래스로 만들어서 초기값에 null이 들어가도록 설정
	static int n;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		dp = new Integer[n][n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < i + 1; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < n; i++) {			
			dp[n - 1][i] = arr[n - 1][i];
		}
		
		System.out.println(result(0, 0));
	}

	private static int result(int i, int j) {
		if ((n - 1) == i)
			return dp[i][j];
		
		if (dp[i][j] == null)
			dp[i][j] = Math.max(result(i + 1, j), result(i + 1, j + 1)) + arr[i][j];
		
		return dp[i][j];
	}
}