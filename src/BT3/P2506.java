package BT3;

import java.util.Scanner;

public class P2506 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int score = 0;
		int oCount = 0;
		
		for (int i = 0; i < N; i++) {
			int ox = sc.nextInt();
			
			if(ox == 1) {
				oCount += 1;
				score += oCount;
			} else {
				oCount = 0;
			}
		}
		System.out.println(score);

	}

}
