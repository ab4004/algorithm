package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_24444 {
	static int[] visited = null;
	static List<List<Integer>> graph = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		visited = new int[n + 1];
		
		for (int i = 0; i < n + 1; i++) {
			graph.add(new ArrayList<>());
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int u  = Integer.parseInt(st.nextToken());
			int v  = Integer.parseInt(st.nextToken());
			
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		
		for (int i = 1; i < n + 1; i++) {
			Collections.sort(graph.get(i));
		}
		
		bfs(r);
		
		for (int i = 1; i < n + 1; i++) {
			sb.append(visited[i]).append("\n");
		}
		
		System.out.println(sb);
	}
	
	static void bfs(int V) {
		Queue<Integer> q = new LinkedList<Integer>();
		int count = 1;
		
		q.offer(V);
		visited[V] = count++;
		
		while (!q.isEmpty()) {
			int index = q.poll();
			
			for (int i = 0; i < graph.get(index).size(); i++) {
				int nextV = graph.get(index).get(i);
				
				if (visited[nextV] == 0) {
					visited[nextV] = count++;
					q.offer(nextV);
				}
			}
		}
	}
}