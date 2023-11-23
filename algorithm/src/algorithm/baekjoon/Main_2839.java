package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2839 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i <= n / 3; i++) {
			for (int j = 0; j <= n / 5; j++) {
				if ((n - (j * 5)) - (i * 3) == 0 && min > i + j) {
					min = i + j;
				}
			}
		}
		
		if (min != Integer.MAX_VALUE)		
			System.out.println(min);
		else
			System.out.println(-1);
	}
}