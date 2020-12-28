package exstring;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();		
		
		for(int i = 0; i < t; i++) { // 테스트케이스만큼 돈다
			
			int r = sc.nextInt(); // 몇번 반복할건지 
			String s = sc.next(); // 문자열 받기
			
			for(int j = 0; j < s.length(); j++) { // 문자열의 길이만큼 반복
				
				for(int k = 0; k < r; k++) {
					System.out.print(s.charAt(j));
				}
				
			}
			
			System.out.println();

		}
		
	}
	
}
