package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main_2164 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<Integer>();
		
		for (int i = 1; i <= n; i++) {
			q.add(i);
		}
		
		while (q.size() != 1) {
			q.remove();
			int d = q.remove();
			q.add(d);
		}
		
		System.out.println(q.remove());
	}
}
