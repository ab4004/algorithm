package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_25644 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int max = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int min = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < n - 1; i++) { 
			int value = Integer.parseInt(st.nextToken());
			min = Math.min(min, value);
			if (max < (value - min))
				max = value - min;
		}
		
		System.out.println(max);
	}
}