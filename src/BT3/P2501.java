package BT3;

import java.util.Scanner;

public class P2501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, K;
		// 약수의 순서를 저장할 변수
		int count = 0;
		// K번째 약수를 저장할 변수
		int result = 0;
		
		N = sc.nextInt();
		K = sc.nextInt();
		// 약수를 구하는 반복문
		for (int i = 1; i <= N; i++) {
			// 약수가 나올때마다 count에 +1
			if(N % i == 0) {
				count++;
			}	
			// count와 K가 같아지면, 즉 그 약수가 K번째 약수란 뜻 
			if(count == K) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}
