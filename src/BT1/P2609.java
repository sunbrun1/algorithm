package BT1;

import java.util.Scanner;

public class P2609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(gcd2(A,B));
		System.out.println(lcm(A,B));
	}
	
	// 최대공약수 반복문 방식
	static int gcd1(int a, int b) {
		
		while(b != 0) {
			int r = a % b;	// 나머지를 구해준다.
	        
			// GCD(a, b) = GCD(b, r)이므로 변환한다.
			a = b;		
			b = r;
		}
		return a;
	}
	 
	// 최대공약수 재귀 방식
	static int gcd2(int a, int b) {
		if(b == 0) return a;
		// GCD(a, b) = GCD(b, r)이므로 (r = a % b)
		return gcd2(b, a % b);
	}
	 
	// 최소공배수 : Least Common mulitple
	static int lcm(int a, int b) {
		return a * b / gcd2(a, b);
	}
	

}
