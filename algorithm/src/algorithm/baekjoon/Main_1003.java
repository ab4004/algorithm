package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			int[] zero = new int[41];
			int[] one = new int[41];
			
			zero[0] = 1;
			one[1] = 1;
			
			for (int j = 2; j <= N; j++) {
				zero[j] = zero[j - 1] + zero[j - 2];
				one[j] = one[j - 1] + one[j - 2];
			}
			
			sb.append(zero[N]).append(" ").append(one[N]).append("\n");
		}
		
		System.out.println(sb);
	}
}