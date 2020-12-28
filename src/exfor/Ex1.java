package exfor;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d", num, i, num * i);
			System.out.println();
		}
		
	}
}
