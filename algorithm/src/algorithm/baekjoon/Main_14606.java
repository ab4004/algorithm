package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_14606 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int value = n / 2;
		int result = 0;
		
		if (n == 1 || n == 2)
			result = n - 1;
		else if (n % 2 == 0) 
			result = value * value + value * (value - 1);
		else 
			result = (value + 1) * value + value * value;
		
		System.out.println(result);
	}
}