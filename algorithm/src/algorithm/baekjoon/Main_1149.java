package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1149 {
	public final static int RED = 0;
	public final static int GREEN = 1;
	public final static int BLUE = 2;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][3];
		
		StringTokenizer st = null;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			arr[i][RED] = Integer.parseInt(st.nextToken());
			arr[i][GREEN] = Integer.parseInt(st.nextToken());
			arr[i][BLUE] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 1; i < n; i++) {		
			arr[i][RED] += Math.min(arr[i - 1][GREEN], arr[i - 1][BLUE]);
			arr[i][GREEN] += Math.min(arr[i - 1][RED], arr[i - 1][BLUE]);
			arr[i][BLUE] += Math.min(arr[i - 1][RED], arr[i - 1][GREEN]);
		}
		
		System.out.println(Math.min(Math.min(arr[n - 1][RED], arr[n - 1][GREEN]), arr[n - 1][BLUE]));
	}
}