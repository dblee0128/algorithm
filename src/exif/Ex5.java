package exif;

import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		if(m >= 45) {
			System.out.println(h + " " + (m - 45));
		} else { // m < 45
			if(h > 0) {
				System.out.println((h - 1) + " " + (m + 15));
			} else if(h == 0) {
				System.out.println((h + 23) + " " + (m + 15));
			}
		}	

	}
	

}
