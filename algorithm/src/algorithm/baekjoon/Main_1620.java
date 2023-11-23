package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		HashMap<String, String> map2 = new HashMap<String, String>();
		for (int i = 1; i <= n; i++) {
			String str = br.readLine();
			map1.put(i + "", str);
			map2.put(str, i + "");
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			String str = br.readLine();
			if (map1.containsKey(str)) {
				sb.append(map1.get(str)).append("\n");
			} else if (map2.containsKey(str)) {
				sb.append(map2.get(str)).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
