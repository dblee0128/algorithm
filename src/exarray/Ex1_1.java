package exarray;

import java.util.Scanner;

public class Ex1_1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int arr[] = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = scan.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			
			if(max < arr[i]) {
				max = arr[i];
			} else if(min > arr[i]) {
				min = arr[i];
			}
			
		}
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
	}

}
