package BT3;

import java.util.Scanner;

public class P2875 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 여학생
		int M = sc.nextInt(); // 남학생
		int K = sc.nextInt(); // 인턴쉽 참가 인원
		int team = 0;
		
		while (N >= 2 && M >= 1 && 	N + M - 3 >= K) {
			N -= 2;
			M--;
			team++;
		}
		System.out.println(team);
	}

}
