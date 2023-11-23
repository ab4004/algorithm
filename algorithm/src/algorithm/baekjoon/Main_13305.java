package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_13305 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long[] length = new long[n - 1];
		long[] base = new long[100001];
		
		for (int i = 0; i < n - 1; i++) {
			length[i] = Long.parseLong(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			base[i] = Long.parseLong(st.nextToken());
		}
		
		long result = 0;
		for (int i = 0; i < n - 1; i++) {
			if (base[i] < base[i + 1])
				base[i + 1] = base[i];
			
			result += (base[i] * length[i]);
		}
		
		System.out.println(result);
	}
}