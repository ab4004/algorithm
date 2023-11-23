package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		HashMap<Integer, Integer> cards = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			int card = Integer.parseInt(st.nextToken());
			if (cards.containsKey(card)) {
				cards.put(card, cards.get(card) + 1);
			} else {
				cards.put(card, 0);
			}
		}

		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < m; i++) {
			int card = Integer.parseInt(st.nextToken());
			if (cards.get(card) != null)
				sb.append(cards.get(card) + 1 + " ");
			else
				sb.append(0 + " ");
		}

		System.out.println(sb);
	}
}