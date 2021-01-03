package exsort;

import java.util.Scanner;

// 선택 정렬을 이용한 방법
public class Ex1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 선택 정렬을 이용한 오름차순 정렬
		// i를 비교 기준, j를 비교하는 대상으로 보자
		for(int i = 0; i < n; i++) {
			
			for(int j = i + 1; j < n; j++) { // i+1: 두번째 요소부터 비교
				
				if(arr[i] > arr[j]) { // 기준보다 더 작은 값이 있다면
					// 값을 교환
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
			
		}

		for(int val : arr) {
			System.out.println(val);
		}
		
	}

}
