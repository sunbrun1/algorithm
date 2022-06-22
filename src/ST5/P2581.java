package ST5;

import java.util.Scanner;

public class P2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[] prime = new int[N];
		int index = 0;
		int sum = 0;
		int firstPrime = 0;

		for (int i = M; i <= N; i++) {
			
			if(is_Prime2(i)) {
				prime[index] = i;
				sum += i;
				index++;
			}
		}
		firstPrime = prime[0];
		if(sum != 0) {
			System.out.println(sum);
			System.out.println(firstPrime);
		}else {
			System.out.println("-1");
		}
	}
	
	static boolean is_Prime(int num) {
		if(num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
	
	static boolean is_Prime2(int Number) {
		if(Number == 1){
			return false;	
		}
		for(int i = 2; i <= Math.sqrt(Number); i++) {
			if(Number % i == 0) return false;
		}
		return true;
	}

}
