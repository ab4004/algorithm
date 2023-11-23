package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main_2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); // 출력시 시간때문에 한번에 담아서 출력
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(arr);
		
		for (int a : arr) {
			sb.append(a).append("\n");
		}
		
		System.out.println(sb);
	}
}