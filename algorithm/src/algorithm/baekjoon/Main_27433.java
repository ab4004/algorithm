package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_27433 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(factorial(Long.parseLong(br.readLine())));
	}

	private static long factorial(long n) {
		if (n < 2)
			return 1;
		return n * factorial(n - 1);
	}
}
