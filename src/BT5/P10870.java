package BT5;

import java.util.Scanner;

public class P10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] fibonacci = new int[N+1];
		/*
		 * 배열
		 */
		for (int i = 0; i < fibonacci.length; i++) {
			if(i==0) fibonacci[0] = 0;
			else if(i==1) fibonacci[1] = 1; 
			else fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
		}
		// System.out.println(fibonacci(N));
		System.out.println(fibonacci[N]);
	}
	
	
	/*
	 * 방법1 재귀함수
	 */
	static int fibonacci(int N) {
		if (N==0) return 0;
		if (N==1) return 1;
		return fibonacci(N-1) + fibonacci(N-2);
	}

}
