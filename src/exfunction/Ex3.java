package exfunction;

import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(arithmetic_sequence(n));
		
	}
	
	public static int arithmetic_sequence(int n) {
		
		int count = 0;				// 수들의 간격의 차가 일치하면 증가하는 변수 = 한수 카운팅 변수
		
		if(n < 100) {
			return n; // 100보다 작은 수는 본인이 한수
		}
		
		else { // 100 ~ 1000의 수가 들어올 때
			
			count = 99; // 1 ~ 99는 모두 한수
			if(n == 1000) { // 1000은 제외니까
				n = 999; // 999로 출력해주기
			}
			
			for(int i = 100; i <= n; i++) {
				int x =	i / 100;			// 백의 자리
				int y = (i / 10) % 10;		// 십의 자리	
				int z = i % 10;				// 일의 자리
				
				if((x - y) == (y - z)) {
					count++;
				}
				
			}

		}
		
		return count;
		
	}
	

}
