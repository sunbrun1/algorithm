package BT4;

import java.util.Scanner;

public class P10808 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] count = new int[26];
		
		String A = sc.next();
		
		for (int i = 0; i < A.length(); i++) {
			count[(int) A.charAt(i) - 97] += 1; 
		}
		
		for (int i = 0; i < count.length; i++) {
			System.out.print(count[i] + " ");			
		}
		
		

	}

}
