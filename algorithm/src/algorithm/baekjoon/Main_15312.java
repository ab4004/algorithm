package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_15312 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nameA = br.readLine();
		String nameB = br.readLine();
		int[] alpabet = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
		int[] arr = new int[nameA.length() + nameB.length()];
		int[] dp = null;
		int cnt = 0;
		
		for (int i = 0; i < nameA.length() + nameB.length(); i++) {
			arr[i] = alpabet[nameA.charAt(cnt) - 'A'];
			arr[++i] = alpabet[nameB.charAt(cnt++) - 'A'];
		}
		
		while (arr.length > 2) {
			dp = new int[arr.length - 1];
			for (int i = 0; i < dp.length; i++) {
				dp[i] = (arr[i] + arr[i + 1]) % 10;
			}
			arr = dp;
		}
		
		System.out.print(arr[0]);
		System.out.print(arr[1]);
	}
}