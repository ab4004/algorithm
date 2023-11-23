package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main_1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		ArrayList<Character> arr = new ArrayList<>();
		
		for (int i = 0; i < str.length(); i++) {
			arr.add(str.charAt(i));
		}
		
		Collections.sort(arr, Comparator.reverseOrder());
		
		for (char c : arr) {
			sb.append(c);
		}
		
		System.out.println(sb);
	}
}