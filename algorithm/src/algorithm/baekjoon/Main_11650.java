package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_11650 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][2]; // n개의 행에 1열에 x좌표 값, 2열에 y좌표 값을 포함하는 배열
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken()); // i줄의 x값
			arr[i][1] = Integer.parseInt(st.nextToken()); // i줄의 y값
		}
		
		// 배열 정렬
		Arrays.sort(arr, (a, b) -> {
			if (a[0] == b[0]) { 	// a배열의 x값이 b배열의 x값과 같다면
				return a[1] - b[1]; // a배열의 y값과 b배열의 y값을 비교하여 값 리턴(리턴된 값은 양수일 경우 교환, 음수일 경우 교환X)
			} else {
				return a[0] - b[0]; // a배열의 x값이 b배열의 x값과 같지 않다면 두 x값을 비교하여 값 리턴
			}
		});
		
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i][0] + " " + arr[i][1]).append("\n");
		}
		
		System.out.println(sb);
	}
}