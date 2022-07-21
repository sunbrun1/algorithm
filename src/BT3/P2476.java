package BT3;

import java.util.Scanner;

public class P2476 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		//최대값 저장할 변수 선언
				int max = 0;
				
				//참가 인원 수 만큼 반복하는 for문
				for(int i = 0; i < N; i++) {
					//사람이 바뀔때마다 금액을 초기화
					int money = 0;
					int A = sc.nextInt();
					int B = sc.nextInt();
					int C = sc.nextInt();
					
					//나오는 눈에 따른 금액 저장
					if(A == B && B == C ) {
						money = 10000 + (A * 1000);
					}else if(A != B && B != C && A != C) {
						money = Math.max(A, Math.max(B, C)) * 100;
					}else {
						if(A == B || A == C) {
							money = 1000 + (A * 100);
						}else {
							money = 1000 + (B * 100);
						}
					}
					//최대값 저장
					if(money > max) {
						max = money;
					}
				}
				System.out.println(max);

	}

}
