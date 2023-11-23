package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2630 {
	static int[][] arr = null;
	static int white = 0;
	static int blue = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		partition(0, 0, n);
		
		System.out.println(white);
		System.out.println(blue);
	}
	
	static void partition(int x, int y, int n) {
		// 종료
		if (checkColor(x, y, n)) {
			if (arr[x][y] == 0)
				white++;
			else
				blue++;
			
			return;
		}
		
		// 분할
		int size = n / 2;
		
		partition(x, y, size);
		partition(x, y + size, size);
		partition(x + size, y, size);
		partition(x + size, y + size, size);
	}

	static boolean checkColor(int x, int y, int n) {
		for (int i = x; i < x + n; i++) {
			for (int j = y; j < y + n; j++) {
				if (arr[x][y] != arr[i][j])
					return false;
			}
		}
		return true;
	}
}