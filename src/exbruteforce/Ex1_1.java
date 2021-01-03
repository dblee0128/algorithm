package exbruteforce;

import java.util.Scanner;

public class Ex1_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 바닥에 깔린 카드의 개수
		int m = sc.nextInt(); // 딜러가 외친 수
		int[] arrNum = new int[n]; // 바닥에 깔린 카드의 값이 담긴 배열

		for (int i = 0; i < n; i++) {
			arrNum[i] = sc.nextInt();
		}

		System.out.println(blackjack(arrNum, n, m));

	}

	static int blackjack(int[] arrNum, int n, int m) {

		int max = 0; // 가장 큰 수
		int temp = 0; // max와의 비교를 위해 세 수의 합을 잠시 담아둘 변수

		for (int i = 0; i < n - 2; i++) { // 5,6,7만 돈다

			for (int j = i + 1; j < n - 1; j++) { // 6,7,8만 돈다

				for (int k = j + 1; k < n; k++) { // 7,8,9만 돈다

					temp = arrNum[i] + arrNum[j] + arrNum[k];

					// 세 카드의 합(temp)이 이전 합(max)보다 크거나 m보다 작거나 같은 경우 max 값 변경
					if (temp > max && temp <= m) {
						max = temp;
					}

				}

			}

		}
		return max;

	}

}
