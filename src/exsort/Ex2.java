package exsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Collections 클래스를 이용한 방법
public class Ex2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		
		for(int val : list) {
			sb.append(val).append('\n');
		}
		
		System.out.println(sb);
		
	}

}
