package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main_2667 {
	static int n = 0;
	static int[][] graph = null;
	static boolean[][] visited = null;
	static int[] dx = {-1, 1, 0, 0}; // 좌측, 우측, 상측, 하측 기준으로 값 설정
	static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		graph = new int[n + 1][n + 1];
		visited = new boolean[n + 1][n + 1];
		
		for (int i = 1; i < n + 1; i++) {
			String row = br.readLine();
			for (int j = 0; j < row.length(); j++) {
				graph[i][j + 1] = row.charAt(j) - '0';
			}
		}
		
		List<Integer> arr = new ArrayList<Integer>();
		
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				if (graph[i][j] != 0 && !visited[i][j]) {
					arr.add(bfs(i, j));
				}
			}
		}
		
		Collections.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		sb.append(arr.size()).append("\n");
		
		for (int i = 0; i < arr.size(); i++) {
			sb.append(arr.get(i)).append("\n");
		}
		
		System.out.println(sb);
	}
	
	static int bfs(int x, int y) {
		Queue<Integer> q = new LinkedList<>();
		visited[x][y] = true;
		int count = 0;
		q.offer(x);
		q.offer(y);
		
		while (!q.isEmpty()) {
			count++;
			int qx = q.poll();
			int qy = q.poll();
			
			for (int i = 0; i < 4; i++) {
				int nextX = qx + dx[i];
				int nextY = qy + dy[i];
				// (1 ~ n, 1 ~ n)의 좌표에 값을 넣기때문에 해당 좌표를 벗어나는 경우와 해당 좌표의 값이 0인 경우를 제외함.
				if (nextX < 1 || nextY < 1 || nextX > n || nextY > n || graph[nextX][nextY] == 0) continue;
				if (!visited[nextX][nextY]) {
					visited[nextX][nextY] = true;
					q.offer(nextX);
					q.offer(nextY);
				}
			}
		}
		
		return count;
	}
}