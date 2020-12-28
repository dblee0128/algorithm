package exarray;

import java.util.Scanner;

public class Ex6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			int score = 0;
			int cnt = 0;
			
			for(int j = 0; j < arr[i].length(); j++) {
				
				if(arr[i].charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0; // O이 아닐 때는 값을 증가시키지 않음
				}
				
				score += cnt;
				
			}
			
			System.out.println(score);
			
			
		}
		
		
	}
}
