package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2738 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][m];

		for (int j = 0; j < n; j++) { // 줄수
			st = new StringTokenizer(br.readLine(), " ");
			for (int k = 0; k < m; k++) { // 칸수
				arr[j][k] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int j = 0; j < n; j++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int k = 0; k < m; k++) {
				arr[j][k] += Integer.parseInt(st.nextToken());
			}
		}
		
		for (int j = 0; j < n; j++) {
			for (int k = 0; k < m; k++) {
				System.out.print(arr[j][k] + " ");
			}
			System.out.println();
		}
	}
}