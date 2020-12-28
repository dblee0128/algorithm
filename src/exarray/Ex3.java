package exarray;

import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		String result = Integer.toString(n1 * n2 * n3); // int -> String으로 변환
	
		
		for(int i = 0; i < 10; i++) { // 0~9까지 총 10줄이 출력되어야 함
			
			int count = 0;
			
			for(int j = 0; j < result.length(); j++) { // 이제 String을 돌려보자
				
				if((result.charAt(j) - '0') == i) { 
					// result를 charAt으로 나누고 char-> int로 변환하여 i와 같은 만큼 + 해준다
					count++;
				}
			}
			
			System.out.println(count);
		}

	}

}
