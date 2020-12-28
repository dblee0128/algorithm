package exinout;

import java.util.Scanner;

public class Ex8 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		scan.close();
		
		System.out.println((double)num1 / num2);
		
		
	}

}