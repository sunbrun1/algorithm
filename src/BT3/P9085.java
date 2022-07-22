package BT3;

import java.util.Scanner;

public class P9085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i < T; i++) {
			sum = 0;
			int N = sc.nextInt();
			for (int j = 0; j < N; j++) {
				int num = sc.nextInt();
				sum += num;
			}
			System.out.println(sum);
		}

	}

}
