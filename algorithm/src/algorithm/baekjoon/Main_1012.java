package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1012 {
	static int n;
	static int m;
	static int[][] arr = null;
	static boolean[][] visited = null;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			arr = new int[n][m];
			visited = new boolean[n][m];
			
			for (int j = 0; j < k; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				int u = Integer.parseInt(st.nextToken());
				int v = Integer.parseInt(st.nextToken());
				
				arr[u][v] = 1;
			}
			
			int cnt = 0;
			
			for (int j = 0; j < n; j++) {
				for (int l = 0; l < m; l++) {
					if (arr[j][l] != 0 && !visited[j][l]) {
						cnt += bfs(j, l);
					}
				}
			}
			
			sb.append(cnt).append("\n");
		}
		
		System.out.println(sb);
	}

	static int bfs(int x, int y) {
		Queue<Integer> q = new LinkedList<>();
		visited[x][y] = true;
		q.offer(x);
		q.offer(y);
		
		while (!q.isEmpty()) {
			int qx = q.poll();
			int qy = q.poll();
			
			for (int i = 0; i < 4; i++) {
				int nextX = qx + dx[i];
				int nextY = qy + dy[i];
				
				if (nextX < 0 || nextY < 0 || nextX > n - 1 || nextY > m - 1 || arr[nextX][nextY] == 0) continue;
				if (!visited[nextX][nextY]) {
					visited[nextX][nextY] = true;
					q.offer(nextX);
					q.offer(nextY);
				}
			}
		}
		
		return 1;
	}
}