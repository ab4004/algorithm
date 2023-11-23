package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2670 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		double[] arr = new double[t];
		double[] dp = new double[t];
		
		for (int i = 0; i < t; i++) {
			arr[i] = Double.parseDouble(br.readLine()); 
		}
		
		dp[0] = arr[0];
		double max = 0;
		
		for (int i = 1; i < arr.length; i++) {
			dp[i] = Math.max(arr[i], arr[i] * dp[i - 1]);
			max = Math.max(max, dp[i]);
		}
		
		System.out.printf("%.3f", max);
	}
} 