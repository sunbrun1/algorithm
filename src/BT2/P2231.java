package BT2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class P2231 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int M = 0;
		
		for(int i = 1 ; i <= N ; i++) {
			
			int number = i;
			int temp = 0;
			
			while(number != 0) {
				temp += number % 10;
				number /= 10;
			}

			if(temp + i == N) {
				M = i;
				break;
			}
		}

		bw.write(String.valueOf(M));

		br.close();
		bw.flush();
		bw.close();
	}

}
