package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_17202 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = br.readLine();

		int[] arr = new int[a.length() + b.length()];
		int[] dp = null;
		int cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = a.charAt(cnt) - '0';
			arr[++i] = b.charAt(cnt) - '0';
			cnt++;
		}
		
		while (arr.length > 2) {
			dp = new int[arr.length - 1];
			for (int i = 0; i < arr.length - 1; i++) 
				dp[i] = (arr[i] + arr[i + 1]) % 10;
			arr = dp;
		}
		
		for(int i : dp)
			System.out.print(i);
	}
}