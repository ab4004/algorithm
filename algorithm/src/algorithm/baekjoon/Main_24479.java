package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main_24479 {
	static int count;
	static int[] visited = null;
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		visited = new int[n + 1];
		
		// 정점의 개수만큼 추가
		for (int i = 0; i < n + 1; i++) {
			graph.add(new ArrayList<>());
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			// 무방향 그래프이기 때문에 양쪽 서로 추가
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		
		// 오름차순 정렬
		for (int i = 0; i < graph.size(); i++) 
			Collections.sort(graph.get(i));
		
		count = 1; // 시작 정점도 순서에 포함하여 1로 초기화
		
		dfs(r);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < visited.length; i++) {
			sb.append(visited[i]).append("\n");
		}
		
		System.out.println(sb);
	}

	static void dfs(int V) { // V : 정점(Vertex)
		visited[V] = count; // 현재 방문중인 정점 순서 저장
		
		for (int v : graph.get(V)) {
			if (visited[v] == 0) {
				count++;
				dfs(v);
			}
		}
	}
}