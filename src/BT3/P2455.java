package BT3;

import java.util.Scanner;

public class P2455 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[4][2];
		
		int max = 0;
		int total = 0;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
				if(j % 2 == 0) {
					total -= arr[i][j]; 						
				}else {
					total += arr[i][j];
				}	
			}
			if(total > max) {
				max = total;
			}
		}	
		System.out.println(max);

	}
}
