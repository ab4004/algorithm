package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_24060 {
	public static int[] temp;
	public static int cnt = 0;
	public static int k;
	public static int result = -1;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		temp = new int[n];
		k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		mergeSort(arr, 0, arr.length - 1);
		
		System.out.println(result);
	}

	private static void mergeSort(int[] arr, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2; // 중간 지점
			mergeSort(arr, start, mid); // 전반부 정렬
			mergeSort(arr, mid + 1, end); // 후반부 정렬
			merge(arr, start, mid, end);
		}
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int i = start;
		int j = mid + 1;
		int t = 0;
		
		while (i <= mid && j <= end) {
			if (arr[i] <= arr[j]) {
				temp[t++] = arr[i++];
			} else {
				temp[t++] = arr[j++];
			}
		}
		
		while (i <= mid) { // 왼쪽 배열 부분이 남은 경우
			temp[t++] = arr[i++];
		}
		
		while (j <= end) { // 오른쪽 배열 부분이 남은 경우
			temp[t++] = arr[j++];
		}
		
		i = start;
		t = 0;
		
		while (i <= end) { // 결과를 arr 배열에 저장
			cnt++;
			if (cnt == k) {
				result = temp[t];
				break;
			}
			arr[i++] = temp[t++];
		}
	}
}
