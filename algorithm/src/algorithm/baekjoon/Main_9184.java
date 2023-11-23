package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_9184 {
	public static int[][][] dp = new int[21][21][21];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if (a == -1 && b == -1 && c == -1)
				break;
			
			sb.append("w(").append(a).append(", ").append(b).append(", ").append(c).append(") = ").append(w(a, b, c)).append("\n");
		}
		
		System.out.println(sb);
	}

	private static int w(int a, int b, int c) {
		// 각 변수들이 범위를 벗어나지 않고, dp[a][b][c]가 0이 아닌 이미 저장된 값이면 불러옴.
		if (a >= 0 && a <= 20 && b >= 0 && b <= 20 && c >= 0 && c <= 20 && dp[a][b][c] != 0)
			return dp[a][b][c];
		
		if (a <= 0 || b <= 0 || c <= 0)
		    return 1;

		if (a > 20 || b > 20 || c > 20)
		    return dp[20][20][20] = w(20, 20, 20);

		if (a < b && b < c)
		    return dp[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);

		return dp[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
	}
}
