package ST5;

import java.util.Scanner;

public class P1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		
		for (int i = 0; i < N; i++) {
			 int number = sc.nextInt();
			 if(is_Prime2(number)) {
				 count++;
			 }
		}
		System.out.println(count);
	}
	
	/*
	 * 방법1
	 */
	static boolean is_Prime(int Number) {
		// 1 은 소수가 아니다.
		if(Number == 1){
			return false;	
		}    
	  
		// 2 ~ Number-1 까지 중 나누어 떨어지는 약수가 있는지 판별
		// Number = 2 의 경우는 자연스럽게 for문을 검사하지 않게 됨
	    
		for(int i = 2; i < Number; i++) {
	    
			if(Number % i == 0) return false;  
		}
		// 위 두 조건에 걸리지 않으면 소수다.
		return true;
	}
	
	/*
	 * 방법 2
	 */
	static boolean is_Prime2(int Number) {
		if(Number == 1){
			return false;	
		}
		for(int i = 2; i <= Math.sqrt(Number); i++) {
			if(Number % i == 0) return false;
		}
		return true;
	}
}
