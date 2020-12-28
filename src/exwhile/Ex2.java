package exwhile;

import java.util.Scanner;

// 테스트 케이스의 개수가 주어지지 않은 경우 + 파일 종료 조건이 없는 경우
public class Ex2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextInt()) { // int가 아닌 값을 입력하면 프로그램이 종료됨
			
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			System.out.println(num1 + num2);
			
		} 
		
	}

}
