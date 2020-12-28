package exfor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex4 {

	public static void main(String[] args) throws IOException { // BufferedReader는 예외처리 필요
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine()); // 테스트 케이스 입력받기
		
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			// br.readLine(), " " : 입력받은 문자열을 공백을 기준으로 나눠라
			int num1 = Integer.parseInt(st.nextToken()); // nextToken(): 맨 앞의 토큰을 반환
			int num2 = Integer.parseInt(st.nextToken()); // nextToken(): 공백을 기준으로 토큰을 반환
			bw.write(num1 + num2 + "\n"); // 출력
		}
		
		br.close();
		bw.flush();
		bw.close();
	
	}
}
