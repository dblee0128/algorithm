package exrecursion;

import java.util.Scanner;

public class Ex1_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorial(n));
		
	}
	
	public static int factorial(int n) {
		
		if(n == 1) {
			return 1;
		}
		return n * factorial(n-1);
	   // 5! = 5 * 4!
       // 4! = 4 * 3!
	   // 3! = 3 * 2!
	   // 2! = 2 * 1!
	   // 1! = -> if문으로 이동
	}

}
