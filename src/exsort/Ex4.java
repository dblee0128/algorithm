package exsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(avg(arr));
		System.out.println(mid(arr));
		System.out.println(mode(arr));
		System.out.println(range(arr));
		
	}
	
	// 산술평균
	static int avg(int[] arr) {
		double result = 0;
		double sum = 0;
		
		for(int x : arr) {
			sum += x;
		}
		
		// Marh.round(): 실수의 소수점 첫 번째 자리를 반올림 (x.0과 같이 출력)
		result = Math.round(sum / arr.length);
		return (int)result;
	}
	
	// 중앙값
	static int mid(int[] arr) {
		int result = arr.length / 2;
		return arr[result];
	}
	
	// 최빈값 - 계수 정렬 사용
	static int mode(int[] arr) {
	
		int[] count = new int[8001]; // 입력값을 담기 위한 배열: -4000 ~ 4000
		int max = 0;
		ArrayList<Integer> list = new ArrayList<>(); // 최빈값을 담기 위한 리스트 (여러 개일수도 있으므로)
		
		// 카운팅을 위해 입력값 범위 넣어주기
		for(int i = 0; i < arr.length; i++) {
			count[arr[i] + 4000]++; // 음수 입력값을 처리하기 위해 +4000 해주기
		}
		
		// 최빈값 구하기
		for(int i = 0; i < count.length; i++) {
			if(max <= count[i]) {
				max = count[i];
			}
		}
		
		// 최빈값을 리스트에 넣어주기
		for(int i = 0; i < count.length; i++) {
			if(count[i] == max) {
				list.add(i-4000);
			} 
		}
		
		Collections.sort(list); // 리스트를 오름차순 정렬
		
		if(list.size() == 1) { // 리스트의 값이 한 개면
			return list.get(0);
		} else { // 리스트의 값이 여러 개면
			return list.get(1);
		}
		
	}
	
	// 범위
	static int range(int[] arr) {
		int result = arr[arr.length - 1] - arr[0];
		return result;
	}
	
}
