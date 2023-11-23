package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1697 {
	static int k;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		
		if (n == k) {
			System.out.println(0);
		} else {
			System.out.println(bfs(n));
		}
	}

	private static int bfs(int start) {
		int[] visited = new int[100001];
		visited[start] = 1;
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);
		
		while (!q.isEmpty()) {
			int[] d = {-1, 1, 2};
			int v = q.poll();
			
			for (int i = 0; i < 3; i++) {
				int nextV = 0;
				
				if (i == 2)
					nextV = v * d[i];
				else
					nextV = v + d[i];
				
				if (nextV < 0 || nextV > 100000) continue;

				if (nextV == k) {
					return visited[v];
				}
				
				if (visited[nextV] == 0) {
					q.offer(nextV);
					visited[nextV] = visited[v] + 1;
				}
			}
		}
		
		return 0;
	}
}
