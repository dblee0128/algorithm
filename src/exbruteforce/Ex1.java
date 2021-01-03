package exbruteforce;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt(); // 바닥에 깔린 카드의 개수
		int m = sc.nextInt(); // 딜러가 외친 수
		int[] arrNum = new int[n]; // 바닥에 깔린 카드의 값이 담긴 배열
		
		for(int i = 0; i < n; i++) {
			arrNum[i] = sc.nextInt();
		}
		
		int max = 0; // 가장 큰 수
		int temp = 0; // max와의 비교를 위해 세 수의 합을 잠시 담아둘 변수
		
		// 5,6,7,8,9 중에 21이랑 가장 가까운 조합을 찾는다고 가정하자.
		
		for(int i = 0; i < n-2; i++) { // 5,6,7만 돈다			
			 
			for(int j = i+1; j < n-1; j++) { // 6,7,8만 돈다		
				
				for(int k = j+1; k < n; k++) { // 7,8,9만 돈다
					
					temp = arrNum[i] + arrNum[j] + arrNum[k]; 
					// arrNum[0] + arrNum[1] + arrNum[2]
					// arrNum[0] + arrNum[1] + arrNum[3]
					// arrNum[0] + arrNum[1] + arrNum[4]
					// arrNum[0] + arrNum[2] + arrNum[2]
					// arrNum[0] + arrNum[2] + arrNum[3]
					// arrNum[0] + arrNum[2] + arrNum[4]
					// arrNum[0] + arrNum[3] + arrNum[2]
					// arrNum[0] + arrNum[3] + arrNum[3]
					// arrNum[0] + arrNum[3] + arrNum[4]
					
					// arrNum[1] : 위와 같은 패턴으로 9번 반복
					
					// arrNum[2] : 위와 같은 패턴으로 9번 반복
		
					if(temp > max && temp <= m) {
						max = temp;
					}
					
				}
				
			}
		
		}
		System.out.println(max);
	}

}
