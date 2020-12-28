package exarray;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int n, total , count;
		double avg;
		int[] score = new int[1000];
		
		for(int i = 0; i < c; i++) {
			
			n = sc.nextInt();
			total = 0;
			count = 0;
			
			for(int j = 0; j < n; j++) {
				score[j] = sc.nextInt();
				total += score[j];
			}
			
			avg = total / n;
			
			for(int j = 0; j < n; j++) {
				if(score[j] > avg) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n", 100.0 * count / n);
			
		}
		
	}
}
