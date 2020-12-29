package exstring;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		String str3 = new StringBuffer().append(str1).reverse().toString();
		String str4 = new StringBuffer().append(str2).reverse().toString();

		
		int num1 = Integer.parseInt(str3);
		int num2 = Integer.parseInt(str4);
		
		System.out.println(num1 > num2 ? num1 : num2);

	}

}
