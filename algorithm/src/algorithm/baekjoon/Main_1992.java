package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1992 {
	static int[][] arr = null;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			
			for (int j = 0; j < n; j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}
		
		partition(0, 0, n);
		System.out.println(sb);
	}
	
	static void partition(int x, int y, int n) {
		if (check(x, y, n)) {
			sb.append(arr[x][y]);
			return;
		}
		
		int size = n / 2;
		
		sb.append('(');
		
		partition(x, y, size);
		partition(x, y + size, size);
		partition(x + size, y, size);
		partition(x + size, y + size, size);
		
		sb.append(')');
	}

	static boolean check(int x, int y, int n) {
		for (int i = x; i < x + n; i++) {
			for (int j = y; j < y + n; j++) {
				if (arr[x][y] != arr[i][j])
					return false;
			}
		}
		
		return true;
	}
}
