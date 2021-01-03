package exsort;

import java.util.Arrays;
import java.util.Scanner;

// Arrays 클래스를 이용한 방법
public class Ex1_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int val : arr) {
			System.out.println(val);
		}
		
	}

}
