package exarray;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int arr[] = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr); // 오름차순 정렬
		System.out.println(arr[0] + " " + arr[num-1]);
		
	}

}
