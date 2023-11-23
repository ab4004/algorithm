package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1018 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int min = 64; // 8 * 8 칸의 개수이며, B와 W는 서로 32개씩을 가지고 있어야 하기 때문에 64로 설정 
		
		boolean[][] chess = new boolean[n][m];
		for (int i = 0; i < n; i++) { // 만들어진 체스판을 배열로 작성
			String row = br.readLine();
			for (int j = 0; j < m; j++) {
				if (row.charAt(j) == 'W') {
					chess[i][j] = true;
				}
			}
		}
		
		
		
		for (int i = 0; i < n - 7; i++) { // 8 * 8 칸의 체스판 만을 확인하기 위해 시작하는 인덱스 0을 감안하여 n과 m에 7을 빼서 실행
			for (int j = 0; j < m - 7; j++) {
				int cnt = 0; // 순서대로 되지 않은 칸의 개수
				
				for (int x = i; x < i + 8; x++) {
					for (int y = j; y < j + 8; y++) {
						if (chess[i][j] != chess[x][y]) { // 첫 번째 칸과 색깔이 똑같지 않을 경우
							cnt++;
						}
						chess[i][j] = !(chess[i][j]); // 다음칸의 색깔이 변하게 하기 위해 반대값 대입
					}
					chess[i][j] = !(chess[i][j]); // 둘째 줄일때 첫줄 반대가 되도록 반대값 대입 (예: 1줄 - BW / 2줄 = WB)
				}
				
				cnt = Math.min(cnt, 64 - cnt); // 첫 번째 칸을 기준으로 색칠할 개수의 최소값
				min = Math.min(min, cnt);
			}
		}
		
		System.out.println(min);
	}
}
