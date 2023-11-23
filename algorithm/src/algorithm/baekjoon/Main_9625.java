package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9625 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arrA = new int[46];
		int[] arrB = new int[46];
		
		arrA[0] = arrB[0] = arrA[1] = 0;
		arrA[2] = arrB[1] = arrB[2] = 1;
		
		for (int i = 3; i <= n; i++) {
			arrA[i] = arrA[i - 1] + arrA[i - 2];
			arrB[i] = arrB[i - 1] + arrB[i - 2];
		}
		
		System.out.println(arrA[n] + " " + arrB[n]);
	}
}
