package exrecursion;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+2];
		
		
		for(int i = 0; i < n; i++) {
			arr[0] = 0;
			arr[1] = 1;
			arr[i + 2] = arr[i] + arr[i + 1];
		}
	
		System.out.println(arr[n]);
	}

}
