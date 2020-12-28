package exfor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) throws IOException { 
	
		// 1. Scanner 사용
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		
		// 2. BufferedReader 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= t; i++) {
			bw.write(i + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
