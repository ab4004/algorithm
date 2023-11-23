package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_25214 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[t];
		
		for (int i = 0; i < t; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;
		int min = arr[0];
		StringBuilder sb = new StringBuilder().append(0).append(" ");
		
		for (int i = 1; i < t; i++) {
			int degree = arr[i] - min;
			max = Math.max(max, degree);
			min = Math.min(min, arr[i]);
			sb.append(max).append(" ");
		}
		
		System.out.println(sb);
	}
}
