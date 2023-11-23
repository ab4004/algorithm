package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2491 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int plusCnt = 0;
		int minusCnt = 0;
		int max = 0;
		int temp = Integer.parseInt(st.nextToken());
		
		for (int i = 1; i < t; i++) {
			int degree = Integer.parseInt(st.nextToken()) - temp; // 현재 값 - 이전 값
			if (degree == 0) { // 차가 0인 경우
				plusCnt++;
				minusCnt++;
			} else if (degree > 0) { // 차가 양수인 경우
				plusCnt++;
				minusCnt = 0;
			} else { // 차가 음수인 경우
				plusCnt = 0;
				minusCnt++;
			}
			temp += degree;
			
			max = Math.max(Math.max(minusCnt, plusCnt), max);
		}
		
		System.out.println(max + 1);
	}
}