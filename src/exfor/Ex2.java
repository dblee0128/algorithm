package exfor;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			System.out.println(num1 + num2);
		}

	}
}
