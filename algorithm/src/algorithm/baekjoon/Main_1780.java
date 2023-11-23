package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1780 {
	static int[][] arr = null;
	static int minus_one = 0;
	static int zero = 0;
	static int one = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		
		StringTokenizer st = null;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		partition(0, 0, n);
		System.out.println(minus_one);
		System.out.println(zero);
		System.out.println(one);
	}

	static void partition(int row, int col, int n) {
		if (check(row, col, n)) {
			if (arr[row][col] == -1) {
				minus_one++;
			} else if (arr[row][col] == 0) {
				zero++;
			} else {
				one++;
			}
			
			return;
		}
		
		int size = n / 3;
		
		partition(row, col, size);
		partition(row, col + size, size);
		partition(row, col + 2 * size, size);
		
		partition(row + size, col, size);
		partition(row + size, col + size, size);
		partition(row + size, col + 2 * size, size);
		
		partition(row + 2 * size, col, size);
		partition(row + 2 * size, col + size, size);
		partition(row + 2 * size, col + 2 * size, size);
	}
	
	static boolean check(int row, int col, int n) {
		for (int i = row; i < row + n; i++) {
			for (int j = col; j < col + n; j++) {
				if (arr[row][col] != arr[i][j])
					return false;
			}
		}
		
		return true;
	}
}