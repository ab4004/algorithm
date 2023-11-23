package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_2606 {
	static List<List<Integer>> graph = new ArrayList<>();
	static boolean[] visited = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		visited = new boolean[n + 1];
		
		for (int i = 0; i < n + 1; i++) {
			graph.add(new ArrayList<>());
		}
		
		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		
		bfs(1);
		
		int count = 0;
		
		for (int i = 2; i < n + 1; i++) {
			if (visited[i])
				count++;
		}
		
		System.out.println(count);
	}
	
	static void bfs(int V) {
		visited[V] = true;
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(V);
		
		while (!q.isEmpty()) {
			int index = q.poll();
			
			for (int i = 0; i < graph.get(index).size(); i++) {
				int nextV = graph.get(index).get(i);
				if (!visited[nextV]) {
					visited[nextV] = true;
					q.offer(nextV);
				}
			}
		}
	}
}
