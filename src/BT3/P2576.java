package BT3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2576 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int min = 101;
		for (int i = 0; i < 7; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num % 2 == 1) {
				sum += num;
				if(min > num) {
					min = num;
				}
			}
		}
		if(sum == 0) {
			System.out.println("-1");
		}else {
			System.out.println(sum);
			System.out.println(min);
		}

	}

}
