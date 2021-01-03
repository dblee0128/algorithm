package exfunction;

public class Ex2 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[10000];
		
		for(int n = 1; n < arr.length; n++) { // n : 1~9999
			if(d(n) >= 10000) { 
				continue; // 10000이 넘어가면 문제의 조건에 부합하지 않으므로 패스
			} else {
				arr[d(n)] = 1; // 셀프넘버가 아니라면(=리턴되는 값이 있다면) 1로 변경
			}
		}
		
		for(int n = 1; n < arr.length; n++) {
			if(arr[n] == 0) { // 셀프넘버는 0의 값을 가짐
				System.out.println(n); // 그 셀프넘버의 인덱스값 출력
			}
		}
		
	}	
	
	// 매개변수 n + 각 자리수의 합
	// 셀프 넘버를 구하는 공식
	public static int d(int n) { 	// 1 ~ 9999까지의 숫자가 들어옴 
		
		int w = n / 1000; 			// 천의 자리
		int x = (n % 1000) / 100;	// 백의 자리
		int y = (n % 100) / 10;		// 십의 자리
		int z = n % 10;				// 일의 자리
		
		return n + w + x + y + z; 	// 셀프넘버는 아예 리턴되지 않음 = 따라서, 메인에서 없는 값들을 추려내면 됨
	}
	
}
