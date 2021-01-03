package exbruteforce;

import java.util.Scanner;

// n을 입력 받아 각 자리 수의 합 구하기

public class Ex2_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // 처음에는 입력받은 값이자 while문을 돌고 나면 남아 있는 숫자들이 담긴 변수
		int sum = 0; // 남은 숫자들 중 마지막 자리의 숫자
		
		// 12345를 입력했다고 가정하자
		
		while(num != 0) { // num이 0이 아닐때까지 반복
			
			sum += num % 10; // num을 10으로 나눈 나머지를 sum에 저장
							 // 첫 번째 바퀴에서는 12345에서 5가 sum에 저장
			
			num /= 10; 		 // num을 10으로 나눈 값을 다시 num에 저장
							 // 첫 번째 바퀴에서는 12345에서 1234가 num에 저장
							
							 // 이 과정을 반복하다보면 5바퀴를 돌게 되고		
		}
		
		System.out.println(sum); // sum의 값을 출력하면 각 자리 숫자의 누적합을 구할 수 있다
	
	}	

}
