package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main_1914 {
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(new BigInteger("2").pow(n).subtract(BigInteger.ONE));
		if (n < 21) {
			hanoi(n, 1, 3, 2);
			System.out.println(sb);
		}
	}
	
	// 메소드 매개변수로 각각 타워의 층수, 기둥 시작, 기둥 끝, 기둥 중간을 받음
	private static void hanoi(int n, int start, int end, int mid) {
		if (n == 1) {
			move(start, end);
			return;
		}
		
		hanoi(n - 1, start, mid, end); // n-1번 층의 타워를 중간 타워로 옮김
		move(start, end);
		hanoi(n - 1, mid, end, start);
	}
	
	// 이동하는 값을 나타내기 위한 메소드
	private static void move(int start, int end) {
		sb.append(start + " " + end + "\n");
	}
}
