package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_25206 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		double majorSum = 0;
		double gradeSum = 0;
		
		for (int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			st.nextToken();
			double grade = Double.parseDouble(st.nextToken());
			String check = st.nextToken();
			if (!check.equals("P")) {
				double rank = func(check);
				majorSum += (grade * rank);
				gradeSum += grade;
			}
			
		}
		
		System.out.println(majorSum / gradeSum);
	}

	private static double func(String rank) {
		switch (rank) {
		case "A+":
			return 4.5;
		case "A0":
			return 4.0;
		case "B+":
			return 3.5;
		case "B0":
			return 3.0;
		case "C+":
			return 2.5;
		case "C0":
			return 2.0;
		case "D+":
			return 1.5;
		case "D0":
			return 1.0;
		case "F":
			return 0.0;
		}
		return 0;
	}
}
