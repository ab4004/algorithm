package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean[] checkArr = null;
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			checkArr = new boolean[26];
			char temp = 'A';
			boolean flag = true;
			
			for (int j = 0; j < str.length(); j++) {
				// 이전 값(temp)과 다르고, checkArr 배열의 해당 문자의 인덱스가 true일 경우
				if (temp != str.charAt(j) && checkArr[str.charAt(j) - 'a']) { 
					flag = false;
					break;
				} // 이전 값과 다르나 checkArr 배열의 해당 문자의 인덱스는 false인 경우 
				else if (temp != str.charAt(j) && !checkArr[str.charAt(j) - 'a']) {
					temp = str.charAt(j);
					checkArr[str.charAt(j) - 'a'] = true;
				} // 이전 값과 다르고, checkArr 배열의 해당 문자의 인덱스도 false인 경우
				else if (temp != str.charAt(j) && !checkArr[str.charAt(j) - 'a']) {
					temp = str.charAt(j);
				}
			}
			
			if (flag) 
				cnt++;
		}
		
		System.out.println(cnt);
	}
}