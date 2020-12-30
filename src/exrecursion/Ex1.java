package exrecursion;

import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 1;
		
		for(int i = n; i > 0; i--) { 
			
			result = result * i;

		}
		System.out.println(result);
	}

}
