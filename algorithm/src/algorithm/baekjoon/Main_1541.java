package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_1541 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");

		String[] str = new String[st.countTokens()];
		
		for (int i = 0; i < str.length; i++) {
			str[i] = st.nextToken();
		}
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i = 0; i < str.length; i++) {
			st = new StringTokenizer(str[i], "+");
			if (st.countTokens() > 1) {
				int sum = 0;
				while (st.hasMoreTokens()) {
					sum += Integer.parseInt(st.nextToken());
				}
				arr.add(sum);
			} else {			
				arr.add(Integer.parseInt(st.nextToken()));
			}
		}
		
		int result = arr.get(0);
		for (int i = 1; i < arr.size(); i++) {
			result -= arr.get(i);
		}
		
		System.out.println(result);
	}
}
