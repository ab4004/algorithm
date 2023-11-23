package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2566 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int[][] arr = new int[9][9];
		int x = 0;
		int y = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (max < arr[i][j]) {
					x = i + 1;
					y = j + 1;
					max = arr[i][j];
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(max + "\n").append(x + " " + y);
		System.out.println(sb);
	}
}