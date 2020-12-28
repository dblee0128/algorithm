package exstring;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
//		1. split()를 사용하는 방법
//		String[] words = str.split(" ");
//		int count = words.length;
//		
//		for(int i = 0; i < words.length; i++) {
//			if(words[i].equals("")) { // 하나하나 다 쪼갰는데 아무 문자도 없다면
//				count--; // 전체 길이에서 -1 해줘라
//			}
//		}
//
//		System.out.println(count);

//		2. StringTokenizer()를 사용하는 방법	
		StringTokenizer strToken = new StringTokenizer(str, " ");
		System.out.println(strToken.countTokens());

	}
	
}
