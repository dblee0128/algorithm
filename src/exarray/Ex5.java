package exarray;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] score = new double[n];
		double max = score[0];
		
		for(int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			if(score[i] > max) {
				max = score[i];
			}
		} // max에 가장 큰 값이 들어간 상태
		
		// 40 50 60
		// 60 / 60 * 100 = 100
		// 50 / 60 * 100 = 83
		// 40 / 60 * 100 = 66
		// (100 + 83 + 66) / 3 = 83
		
		// (score[i] / max) * 100 -> 이걸 세 번 돌리고 다시 score 배열에 넣기
		// score 배열의 값의 평균 구하기
		
		Arrays.sort(score);
		
		double sum = 0;
		double avg = 0;
		
		for(int i = 0; i < score.length; i++) {
			score[i] = score[i] / score[score.length - 1] * 100;
			sum = sum + score[i];
		}
	
		avg = sum / score.length;
		System.out.println(avg);
		
	}
}
