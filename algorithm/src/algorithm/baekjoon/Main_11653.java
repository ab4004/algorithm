package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11653 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int n = Integer.parseInt(br.readLine());
		boolean run = true;
		int i = 2;
		while (run) {
			if (n % i == 0) {
				n /= i;
				System.out.println(i);
			} else {
				i++;
			}
			
			if (n <= 1) {
				run = false;
				break;
			}
		}
	}
}
