package exbruteforce;

import java.util.Scanner;

// n을 입력받아 n의 가장 작은 생성자를 찾아라

public class Ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0; // 가장 작은 생성자가 담길 변수
		
		for(int i = 0; i < n; i++) { // i는 생성자 (생성자는 무조건 n보다 작으므로 n보다 작을 때까지 돌리기)
			
			int sum = 0; // 각 자릿수 합 변수
			int number = i;
			
			// 각 자릿수 더하기
			while(number != 0) {
				sum = sum + (number % 10);
				number = number / 10;
			}
			
			// i 값과 각 자릿수 누적합이 같을 경우 (생성자를 찾았을 때)
			if(sum + i == n) {
				result = i;
				break;
			}
			
		}
		
		System.out.println(result);
	
	}	

}
