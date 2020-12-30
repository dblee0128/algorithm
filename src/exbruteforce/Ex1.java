package exbruteforce;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt(); // 바닥에 깔린 카드의 개수
		int m = sc.nextInt(); // 딜러가 외친 수
		int[] arrNum = new int[n]; // 바닥에 깔린 카드의 값
		
		for(int i = 0; i < n; i++) {
			arrNum[i] = sc.nextInt();
		}
		
		int max = 0;
		int temp = 0;
		
		// 5,6,7,8,9 중에 21이랑 가장 가까운 조합을 찾는다고 가정하자.
		
		for(int i = 0; i < n-2; i++) { 			
			 
			for(int j = i+1; j < n-1; j++) { 		
				
				for(int k = j+1; k < n; k++) {
					
					temp = arrNum[i] + arrNum[j] + arrNum[k];
					
					if(temp > max && temp <= m) {
						max = temp;
					}
					
				}
				
			}
		
		}
		System.out.println(max);
	}

}
