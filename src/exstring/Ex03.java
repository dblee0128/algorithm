package exstring;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		for(char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(str.indexOf(ch) + " ");
		}
		
		// 입력: str = dabin
		// ch = a -> str.indexOf(a) -> dabin에서 a의 위치 출력 -> 1
		// ch = b -> str.indexOf(b) -> dabin에서 b의 위치 출력 -> 2
		// ch = c -> str.indexOf(c) -> dabin에서 c의 위치 출력 -> -1 (왜 -1이냐? 해당 문자가 문자열에 없으면 -1을 리턴)
		// ch = i -> str.indexOf(d) -> dabin에서 d의 위치 출력 -> 0
		// 1 2 -1 0 ...... 과 같은 순서로 출력됨
		
	}
	
}
