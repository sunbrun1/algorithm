package BT4;

import java.util.Scanner;

public class P11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String inputs = sc.next();
		sc.close();
		
		int result = 0;
		for (int i = 0; i < n; ++i) {
			result += inputs.charAt(i) - '0';
		}
		System.out.println(result);

	}

}
