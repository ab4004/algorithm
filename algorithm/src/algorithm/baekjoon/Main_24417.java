package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_24417 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a = 1;
		int b = 1;
		int temp = 0;
		
		for (int i = 3; i <= n; i++) {
			temp = b;
			b = (a + b) % 1000000007;
			a = temp;
		}
		
		System.out.println(b + " " + (n - 2));
	}
}