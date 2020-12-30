package exstring;

import java.util.Scanner;

public class Ex10 {
	
	static Scanner sc = new Scanner(System.in); // 두 메서드에서 모두 사용할 수 있도록 static 변수로 선언
	
	public static void main(String[] args) {
		
		int count = 0;
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			if(check() == true) {
				count++;
			}
		}
		
		System.out.println(count);

	}
	
	// 그룹 단어를 체크할 함수
	public static boolean check() {
		
		boolean[] check = new boolean[26]; // 알파벳 26개의 단어를 체크 - 기본 false로 채워져있음
		int prev = 0; // 앞선 문자와 연속되는지, 아닌지 판별
		String str = sc.next();
		
		for(int i = 0; i < str.length(); i++) {
			
			int now = str.charAt(i); // i번째 문자 지정 (현재 문자)
			
			// 앞선 문자와 i번째 문자가 다르다면? (처음엔 당연히 다를테니 해당 문장 실행 -> 왜? 0 != 'a'(97) 이것이 참이니까
			if(prev != now) {
				
				// 해당 문자가 처음 나오는 경우 (false인 경우)
				// a를 빼주는 이유 (배열을 0부터 시작하기 위해! - 97을 빼도 동일한 결과)
				if(check[now - 'a'] == false) {
					check[now - 'a'] = true; // true로 변경
					prev = now; // 다음 턴을 위해 prev도 변경
				}
				// 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아님)
				else {
					return false;
				}
			}
			
			// 앞선 문자와 i번째 문자가 같다면? (연속된 문자)
			else {
				continue;
			}
			
		}
		return true;
	}
	
}