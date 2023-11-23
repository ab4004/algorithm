package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_25501 {
	public static int cnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String str = br.readLine();			
			cnt = 0;
			System.out.println(isPalindrome(str) + " " + cnt);
		}
	}
	
	private static int isPalindrome(String s) {
		cnt++;
		return recursion(s, 0, s.length() - 1);
	}

	private static int recursion(String s, int start, int end) {
		if (start >= end) {
			return 1;
		}
		else if (s.charAt(start) != s.charAt(end)) {
			return 0;
		}
		else {
			cnt++;
			return recursion(s, start + 1, end - 1);
		}
	}
}