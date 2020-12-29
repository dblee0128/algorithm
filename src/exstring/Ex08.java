package exstring;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		int count = 0; // 덧셈을 count로 받는다고 생각
		
		for(int i = 0; i < word.length(); i++) {
			
			String words = String.valueOf(word.charAt(i)).toUpperCase();
			
			switch(words) {
				case "A": case "B": case "C":
					count += 3;
					break;
				case "D": case "E": case "F":
					count += 4;
					break;
				case "G": case "H": case "I":
					count += 5;
					break;
				case "J": case "K": case "L":
					count += 6;
					break;
				case "M": case "N": case "O":
					count += 7;
					break;
				case "P": case "Q": case "R": case "S":
					count += 8;
					break;
				case "T": case "U": case "V":
					count += 9;
					break;
				case "W": case "X": case "Y": case "Z":
					count += 10;
					break;
			}
		
		}
		
		System.out.println(count);
		
	}

}
