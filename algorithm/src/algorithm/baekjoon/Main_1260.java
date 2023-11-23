package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1260 {
	static List<List<Integer>> graph = new ArrayList<>();
	static int[] visited = null;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		
		for (int i = 1; i < n + 1; i++)
			Collections.sort(graph.get(i));
		
		dfs(r);
		
		sb.append("\n");
		Arrays.fill(visited, 0);
		
		bfs(r);
		
		System.out.println(sb);
	}
	
	static int count = 1;
	static void dfs(int V) {
		visited[V] = count;
		sb.append(V).append(" ");
		for (int i = 0; i < graph.get(V).size(); i++) {
			int nextV = graph.get(V).get(i);
			if (visited[nextV] == 0) {
				count++;
				dfs(nextV);
			}
		}
	}
	
	static void bfs(int V) {
		count = 1;
		
		Queue<Integer> q = new LinkedList<>();
		visited[V] = count++;
		q.offer(V);
		
		while (!q.isEmpty()) {
			int value = q.poll();
			sb.append(value).append(" ");
			for (int i = 0; i < graph.get(value).size(); i++) {
				int nextV = graph.get(value).get(i);
				if (visited[nextV] == 0) {
					visited[nextV] = count++;
					q.offer(nextV);
				}
			}
		}
	}
}