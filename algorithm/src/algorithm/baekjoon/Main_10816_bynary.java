package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_10816_bynary {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) 
			arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < m; i++) {
			int value = Integer.parseInt(st.nextToken());
			
			sb.append(upper(arr, value) - lower(arr, value)).append(" ");
		}

		System.out.println(sb);
	}

	static int upper(int[] arr, int value) {
		int left = 0;
		int right = arr.length;
		
		while (left < right) {
			int mid = (left + right) / 2;
			
			if (value < arr[mid])
				right = mid;
			else
				left = mid + 1;
		}
		
		return left;
	}

	static int lower(int[] arr, int value) {
		int left = 0;
		int right = arr.length;
		
		while (left < right) {
			int mid = (left + right) / 2;
			
			if (value <= arr[mid])
				right = mid;
			else
				left = mid + 1;
		}
		
		return left;
	}
}