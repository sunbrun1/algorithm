package BT1;

import java.util.Scanner;

public class P1292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fNum = sc.nextInt();
		int lNum = sc.nextInt();
		int[] arrNum = new int[1001]; 
		int sum = 0;
		int count = 1;

		for (int i = 1; i <= 1000; i++) {
			for (int j = 0; j < i; j++) {
				if(count == 1001) break;
				arrNum[count] = i;
				count++;
			}
		}
		
		for (int i = fNum; i <= lNum; i++) {
			sum += arrNum[i];
		}
		System.out.println(sum);
		

	}

}
