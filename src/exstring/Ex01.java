package exstring;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		// char -> int형으로 반환하면 ASCII 코드값 출력 가능
		// char -> int형으로 변환하려면 charAt(0)-'0'
		int n = str.charAt(0); 
		
		System.out.println(n);

	}
	
}
