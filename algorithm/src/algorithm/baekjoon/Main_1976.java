package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_1976 {
	static int[] parent = null;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		parent = new int[n + 1];
		
		StringTokenizer st = null;
		
		for (int i = 1; i <= n; i++) {
			parent[i] = i;
		}
		
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 1; j <= n; j++) {
				int check = Integer.parseInt(st.nextToken());
				
				if (check == 1)
					Union(i, j);
			}
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int start = Find(Integer.parseInt(st.nextToken()));
		
		for (int i = 1; i < m; i++) {
			int value = Integer.parseInt(st.nextToken());
			
			if (start != Find(value)) {
				bw.write("NO");
				bw.flush();
				bw.close();
				return;
			}
		}
		
		bw.write("YES");
		bw.flush();
		bw.close();
	}
	
	static void Union(int x, int y) {
		x = Find(x);
		y = Find(y);
		
		if (x == y) return;
		if (x < y) parent[y] = x;
		else parent[x] = y;
	}
	
	static int Find(int value) {
		if (value == parent[value]) {
			return value;
		}
		
		return parent[value] = Find(parent[value]);
	}
}