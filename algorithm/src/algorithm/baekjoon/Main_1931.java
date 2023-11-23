package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_1931 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] time = new int[n][2];
		StringTokenizer st = null;
				
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			time[i][0] = Integer.parseInt(st.nextToken()); // 시작 시간
			time[i][1] = Integer.parseInt(st.nextToken()); // 종료 시간
		}
		
		Arrays.sort(time, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) // 종료 시간이 같을 경우 시작이 빠른 순
					return o1[0] - o2[0];
				
				return o1[1] - o2[1];
			}
		});
		
		int count = 0;
		int last = 0;
		
		for (int i = 0; i < n; i++) {
			if (last <= time[i][0]) {
				last = time[i][1];
				count++;
			}
		}
		
		System.out.println(count);
	}
}
