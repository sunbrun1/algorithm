package BT2;

import java.util.Scanner;

public class P2979 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int[][] truck = new int[3][2];
		int[] arr = new int[100];
		int first = 101; // 가장 먼저 주차장에 도착한 트럭의 시간
		int last = 0;	 // 가장 늦게 주차장에 도착한 트럭의 시간
		int fee = 0;
		for (int i = 0; i < 3; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			truck[i][0] = start;
			truck[i][1]= end;
			for (int j = start; j < end; j++) {
				arr[j]++;
			}	
		}
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				if(truck[i][j] < first)	first = truck[i][j];
				if(truck[i][j] > last)	last = truck[i][j];
			}
		}
		
		for(int i=first; i<last; i++) {
			fee += (arr[i] == 1) ? arr[i] * A : 0;
			fee += (arr[i] == 2) ? arr[i] * B : 0;
			fee += (arr[i] == 3) ? arr[i] * C : 0;
		}
		System.out.println(fee);
	}
}
