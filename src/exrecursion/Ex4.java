package exrecursion;

import java.util.Scanner;

public class Ex4 {
	
	static StringBuilder sb = new StringBuilder(); // 이동 순서가 담길 배열
	static int cnt = 0; // 이동 횟수
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		hanoi(n, 1, 2, 3); // 막대기 세 개를 순서대로 1, 2, 3으로 지정해줌
		
		System.out.println(cnt);
		System.out.println(sb);
		
	}
	
	// 원판의 개수(n), 출발지(1), 경유지(2), 목적지(3)
	public static void hanoi(int n, int start, int mid, int to) {

		cnt++; // 이동 횟수 증가
		
		// 이동할 원반의 수가 1개라면
		if(n == 1) {
			sb.append(start + " " + to + "\n"); // 바로 1번에서 3번으로 이동해라.
			return;
		}
		
		// 이동할 원판의 수가 1개가 아닐 때
		
		// 첫째: n-1개를 1번에서 2번으로 이동 (그래야 1번 맨 아래에 있는 원판이 3번으로 가지)
		// 과정: 1번의 원판들을 3번 막대기를 이용해서 2번으로 옮기자. 그래야 3번이 비니까. 
		hanoi(n-1, start, to, mid); // 따라서, 1->3->2 순서가 됨
		
		// 둘째: 1번에 남아있는 제일 큰 원판을 1번에서 3번으로 이동 (위에서 도와줘서 이제야 비로소 목적지에 도착하게 됨)
		sb.append(start + " " + to + "\n"); // 따라서, 1->3 순서가 됨
		
		// 셋째: n-1개를 2번에서 3번으로 이동 (이제 얘네들도 목적지로 보내주자)
		// 과정: 2번에 남아있는 원판들을 1번을 이용해서 3번으로 옮겨주자. 
		hanoi(n-1, mid, start, to); // 따라서, 2->1->3 순서가 됨
		
	}
	
}