package exfor;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) { 
	
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 5
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) { // 4-3-2-1
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i; k++) { // 1-2-3-4-5
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		
	}
}
