package BT2;

import java.util.Scanner;

public class P10988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		// reverse
	    StringBuffer sb = new StringBuffer(word);
	    String reversedWord = sb.reverse().toString();
	    
		if(word.equals(reversedWord)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}

	}

}
