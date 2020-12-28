package exstring;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String n = sc.next();
		int sum = 0;
		
		for(int i = 0; i < n.length(); i++) {
			
			int num =  n.charAt(i) - '0';
			sum += num;
			
		}
		
		System.out.println(sum);
	
	}
	
}
