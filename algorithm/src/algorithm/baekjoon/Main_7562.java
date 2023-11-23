package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_7562 {
	static int n;
	static int[][] visited = null;
	
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			n = Integer.parseInt(br.readLine());
			
			visited = new int[n][n];
			
			st = new StringTokenizer(br.readLine(), " ");
			int startX = Integer.parseInt(st.nextToken());
			int startY = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine(), " ");
			int endX = Integer.parseInt(st.nextToken());
			int endY = Integer.parseInt(st.nextToken());
			
			if (startX == endX && startY == endY)
				sb.append(0).append("\n");
			else {
				bfs(startX, startY);
				sb.append(visited[endX][endY]).append("\n");
			}
		}
		
		System.out.println(sb);
	}
	
	static void bfs(int x, int y) {
		int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
		int[] dy = {1, -1, 2, -2, 2, -2, 1, -1};
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(x);
		q.offer(y);
		
		visited[x][y] = 0;
		
		while (!q.isEmpty()) {
			int qx = q.poll();
			int qy = q.poll();
			
			for (int i = 0; i < 8; i++) {
				int nx = qx + dx[i];
				int ny = qy + dy[i];
				
				if (nx < 0 || ny < 0 || nx >= n || ny >= n || visited[nx][ny] != 0) continue;
				if (visited[nx][ny] == 0) {
					visited[nx][ny] = visited[qx][qy] + 1;
					q.offer(nx);
					q.offer(ny);
				}
			}
		}
	}
}