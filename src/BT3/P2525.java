package BT3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2525 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int inputM = Integer.parseInt(br.readLine());
		
		H += inputM / 60;
		M += inputM % 60;
		
		if(M > 59) {
			H += 1;
			M -= 60;
		}
		if(H > 23) {
			H -= 24;
		}
		System.out.println(H + " " + M);

	}

}
