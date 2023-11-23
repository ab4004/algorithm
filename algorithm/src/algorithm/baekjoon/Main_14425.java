package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		// HashMap<String, Integer> 로 선언하는데 사실상 Integer 값은 필요없지만 String 키값이 완전 일치되는 키값으로 찾을 수 있어서 이를 이용
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < n; i++) {
			map.put(br.readLine(), 0);
		}
		
		int cnt = 0;
		
		for (int i = 0; i < m; i++) {
			if (map.containsKey(br.readLine())) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}