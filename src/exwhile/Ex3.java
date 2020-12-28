package exwhile;

import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt(); // 테스트 케이스
		int n = t; // 비교를 위해 처음 입력한 값 복사 (동일한 값이 들어가게 됨)
		int count = 0;
		
		while(true) {
			
			// 48 = 4 + 8 = 12 -> 82
			// 4 + 8의 8과 12의 2를 가져와서 더하는 연산
			// 8*10 = 80 --> ((t%10) * 10)
			// 2 --> (((t/10) + (t%10)) % 10)
			
			t = ((t%10) * 10) + (((t/10) + (t%10)) % 10);
			count++;
			
			if(t == n) {
				break;
			}
			
		}
		System.out.println(count);
	}

}
