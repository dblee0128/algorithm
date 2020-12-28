package exwhile;

import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			if(num1 == 0 && num2 == 0) {
				break;
			}
			
			System.out.println(num1 + num2);
			
		} 
		
	}

}
