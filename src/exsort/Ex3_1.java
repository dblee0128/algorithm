package exsort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 계수 정렬 (카운팅 정렬)
public class Ex3_1 {
	
	public static void main(String[] args) throws IOException {
		
		// 입력 가능한 수의 범위 (1~10000)
		// 사용자가 입력한 수에 따라 카운팅이 잡힐 배열
		int[] cnt = new int[10001]; 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 몇 개의 수를 입력받겠니?
		
		for(int i = 0; i < n; i++) {
			// 해당 인덱스의 값을 1 증가 = 카운팅
			// 계수 정렬의 방법: 사용자가 입력한 숫자에 해당하는 배열 인덱스의 값을 1씩 증가시킴
			cnt[Integer.parseInt(br.readLine())] ++;
		}
		
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		// 0은 입력 범위에 없으므로 cnt배열에서 1부터 10000까지 출력
		for(int i = 1; i < 10001; i++) {
			
			// i 값이 개수가 0이 될때까지 출력
			while(cnt[i] > 0) {
				sb.append(i).append('\n');
				cnt[i]--; // 카운팅이 0이 될때까지 출력하기 위해 필요! (0이 되면 while문 빠져나감)
			}
		}
		
		System.out.println(sb);
		
	}

}
