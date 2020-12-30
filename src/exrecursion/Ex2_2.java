package exrecursion;

import java.util.Scanner;

public class Ex2_2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibonacci(n));
		
	}
	
	public static int fibonacci(int n) {
		
		if(n == 0) return 0;
		if(n == 1) return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
		// 구하고자 하는 값의 한 칸 앞의 값 + 두 칸 앞의 값 
		// n = (n-1) + (n-2)
		// fibonacci(5) = fibonacci(4) + fibonacci(3)
		
	}

}
