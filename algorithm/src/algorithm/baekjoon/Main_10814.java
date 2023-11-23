package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_10814 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		String[][] arr = new String[n][2];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		Arrays.sort(arr, (a, b) -> {
			return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
		});
		
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i][0] + " " + arr[i][1] + "\n");
		}
		
		System.out.println(sb);
	}
}