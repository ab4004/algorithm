package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_4779 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input;
		while ((input = br.readLine()) != null) { // End of File 전까지 입력받음
			int n = Integer.parseInt(input);
			int powN = (int) Math.pow(3, n);
			char[] dash = new char[powN];
			for (int i = 0; i < dash.length; i++) {
				dash[i] = '-';
			}
			DaC(dash, 0, powN);
			
			for (int i = 0; i < dash.length; i++) {
				sb.append(dash[i]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	private static void DaC(char[] dash, int start, int end) {
		if (end < 3) return; // 문자 배열의 끝 길이가 3보다 작을 경우 종료
		
		int cutStart = end / 3; // 잘릴 시작 지점
		int cutEnd = start + cutStart * 2; // 잘릴 끝 지점
		
		for (int i = start + cutStart; i < cutEnd; i++) {
			dash[i] = ' ';
		}
		
		DaC(dash, start, cutStart);
		DaC(dash, cutEnd, cutStart);
	}
}
