package exfor;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) { 
	
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 몇 개의 수 = 배열의 길이
		int x = scan.nextInt(); // x보다 작은 수
		int arr[] = new int[n]; // n 길이의 배열

		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			if(arr[i] < x) {
				System.out.print(arr[i] + " ");
			}
		}
		
	}
}
