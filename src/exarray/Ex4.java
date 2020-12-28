package exarray;

import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10]; // 사용자로부터 입력받는 수 저장
		int[] b = new int[10]; // %42한 수 저장
		int cnt = 0;
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i] % 42;
		}
		
		for(int i = 0; i < b.length; i++) {
			
			for(int j = 0; j < b.length; j++) {
				
				if(b[i] == b[j]) { // i를 선발대로 움직이고 그 뒤로 j를 하나씩 체크
					cnt--; // 같다면 하나 빼서 중복된 값 제거
					break;
				}
				
			}
			cnt++; // 일단 다 더해주고, 빼는 형식으로 진행
		}
		
		System.out.println(cnt);
	}

}
