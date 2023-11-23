package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15649 {
	static int n;
	static int m;
	static int[] arr;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		visited = new boolean[n];
		
		dfs(0);
		
		System.out.println(sb);
	}
	
	static void dfs(int depth) {
		if (depth == m) { // 재귀의 깊이가 m과 같을 경우 종료
			for (int i : arr)
				sb.append(i).append(" ");
			sb.append("\n");
			return;
		}
		
		for (int i = 0; i < n; i++) {
			if (!visited[i]) { // 방문하지 않았을 경우만 재귀호출
				visited[i] = true;
				arr[depth] = i + 1;
				dfs(depth + 1);
				visited[i] = false; // 재귀 종료되면 다시 이전 값으로 돌려둠
			}
		}
	}
}
