package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9506 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = null;
		while (true) {
			sb = new StringBuilder();
			int n = Integer.parseInt(br.readLine());
			
			if (n == -1) {
				break;
			}
			
			int[] arr = new int[n + 1];
			int cnt = 1;
			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					arr[cnt] = i;
					cnt++;
				}
			}
			
			int sum = 0;
			for (int i = 1; i < arr.length; i++) {
				sum += arr[i];
			}
			if (sum == n) {
				sb.append(n + " = ");
				for (int i = 1; i < arr.length; i++) {
					if (arr[i] == 0)
						break;
					if (arr[i + 1] != 0) {
						sb.append(arr[i] + " + ");
					} else {
						sb.append(arr[i]);
					}
				}
			} else {
				sb.append(n + " is NOT perfect.");
			}
			
			System.out.println(sb);
		}
	}
}