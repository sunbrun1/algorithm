package BT3;

import java.util.Scanner;

public class P3460 {

	public static void main(String[] args) {
		/*
		 *  방법1 - 배열 사용
		 *  
		Scanner sc = new Scanner(System.in);
		int T, N, R;
		T = sc.nextInt();
		String[] binary = new String[T];
		
		// 2진수 구하는 반복문
		for (int i = 0; i < T; i++) {
			N = sc.nextInt();
			String tmp = "";
			while (N / 2 != 0) {
				tmp += N % 2; 
				N /= 2;
			}
			tmp += N;
			binary[i] = tmp;
		}
		for (String tmp : binary) {
			for (int i = 0; i < tmp.length(); i++) {
				if(tmp.charAt(i) == '1') {
					System.out.print(i+" ");
				}
			}
			System.out.println("");
		}
		*/
		
		/*
		 * 방법 2 - toBinaryString 사용
		 */
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			String binaryN = Integer.toBinaryString(N);

			for (int j = binaryN.length()-1; j >= 0; j--) {
				if(binaryN.charAt(j) == '1') {
					System.out.print(binaryN.length()-j-1 + " ");					
				}
			}
			System.out.println();
		}
	}
}
