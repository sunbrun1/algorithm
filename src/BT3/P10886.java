package BT3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10886 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i = 0; i < N; i++) {
			int M = Integer.parseInt(br.readLine());
			
			if(M == 0) {
				count++;
			} else {
				count--;
			}
		}
		if(count > 0) {
			System.out.println("Junhee is not cute!");
		}else {
			System.out.println("Junhee is cute!");
		}

	}

}
