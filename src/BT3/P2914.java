package BT3;

import java.util.Scanner;

public class P2914 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt(); // 앨범에 수록된 곡에 포함되어 있는 저작권이 있는 멜로디의 개수
		int B = sc.nextInt(); // 평균값
		int C; // 앨범에 수록된 곡의 개수
		
		// (창영이 앨범에 수록된 곡에 포함되어 있는 저작권이 있는 멜로디의 개수) / (앨범에 수록된 곡의 개수) = (평균값)
		// 앨범에 수록된 곡의 개수 = (창영이 앨범에 수록된 곡에 포함되어 있는 저작권이 있는 멜로디의 개수) X (평균값)
		// C = A X B
		C = A * (B-1);
		C += 1;
		System.out.println(C);

	}

}
