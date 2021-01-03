package exbruteforce;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 전체 사람의 수
		
		int[][] arr = new int[n][2]; // 몸무게와 키가 담길 배열
		
		for(int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt(); // [i][0] : 몸무게
			arr[i][1] = sc.nextInt(); // [i][1] : 키
		}
		
		
		for(int i = 0; i < n; i++) { // 모든 사람을 기준으로 잡는 반복문
			
			int rank = 1; // 순위는 1로 초기화
			
			for(int j = 0; j < n; j++) { // 기준으로 잡은 사람과 다시 모든 사람을 비교 반복
				
				if(i == j) continue; // 같은 사람은 비교할 필요가 없음
				
				/*
				Q)만일 자신보다 더 큰 덩치의 사림이 k명이라면 그 사람의 덩치 등수는 k+1이 된다.
				A)기준으로 잡은 사람보다(i) 키와 몸무게가 큰 사람을 만나면(j) 랭크 증가
				*/
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
				
					rank++;
				}
			}
			
			System.out.printf(rank + " ");
		}

		
		
		
	}

}
