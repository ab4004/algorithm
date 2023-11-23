package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_2178 {
	static int n;
	static int m;
	static int[][] graph = null;
	static boolean[][] visited = null;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		graph = new int[n + 1][m + 1];
		visited = new boolean[n + 1][m + 1];

		for (int i = 1; i < n + 1; i++) {
			String row = br.readLine();
			for (int j = 1; j < m + 1; j++) {
				graph[i][j] = row.charAt(j - 1) - '0';
			}
		}

		System.out.println(bfs(1, 1));
	}

	static int bfs(int x, int y) {
		Queue<Integer> q = new LinkedList<>();
		int[] dx = { 1, -1, 0, 0 };
		int[] dy = { 0, 0, 1, -1 };
		int count = 1;
		visited[x][y] = true;
		q.offer(x);
		q.offer(y);
		q.offer(count);
		
		while (!q.isEmpty()) {
			int qx = q.poll();
			int qy = q.poll();
			int qCount = q.poll();
			
			for (int i = 0; i < 4; i++) {
				int nx = qx + dx[i];
				int ny = qy + dy[i];

				if (nx < 1 || ny < 1 || nx > n || ny > m || graph[nx][ny] == 0)
					continue;

				if (!visited[nx][ny]) {
					visited[nx][ny] = true;
					q.offer(nx);
					q.offer(ny);
					q.offer(qCount + 1);
				}
			}
			
			if (qx == n && qy == m)
				return qCount;
		}
		return 0;
	}
}