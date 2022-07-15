package BT3;

import java.util.Scanner;

public class P2010 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int sum = 0;
		int cnt = sc.nextInt();
		
		for (int i = 0; i < cnt; i++) {
			int num = sc.nextInt();
			sum += num;
		}
		System.out.println(sum-(cnt-1));

	}

}
