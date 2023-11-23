package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_3003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = st.countTokens();
		int[] result = new int[n];

		for (int i = 0; i < n; i++) {
			int chess = Integer.parseInt(st.nextToken());
			if (i == 0 || i == 1) { // 킹 또는 퀸일 때
				result[i] = (1 - chess);
			} else if (i == n - 1) { // 폰일 때
				result[i] = (8 - chess);
			} else { // 그외 체스말일 때
				result[i] = (2 - chess);
			}
		}

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}