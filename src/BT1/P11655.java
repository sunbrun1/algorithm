package BT1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11655 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = br.readLine();
		
		int inputLength = input.length();
		
		
		for (int i = 0; i < inputLength; i++) {
			int code = input.charAt(i);
			if(code>=65 && code<=90) {
				code += 13;
				
				if(code > 90) {
					int shift = code-91;
					code = 65+shift;
				}
			}else {
				if(code>=97 && code<=122) {
					code += 13;
					
					if(code > 122) {
						int shift = code-123;
						code = 97 + shift;
					}
				}
			}
			sb.append((char)code);
		}
		System.out.println(sb);

	}

}
