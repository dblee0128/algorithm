package exarray;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[9];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int max = arr[0]; // 첫 번째 인자를 가장 크게 잡고 차례대로 비교할 예정
		int index = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] >= max) { // 첫 번째에 arr[0] >= arr[0]의 비교이므로
				max = arr[i];
				index = i + 1;
			}
			
		}
		
		System.out.println(max + "\n" + index);
		
	}

}
