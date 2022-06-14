package BT3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P10818 {

	public static void main(String[] args) throws IOException {
		/*
		 *	방법1 [Scanner 배열] 
		 
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arrN = new int[T];
		
		for (int i = 0; i < T; i++) {
			arrN[i] =   sc.nextInt();
		}
		sc.close();
		Arrays.sort(arrN);
		
		System.out.println(arrN[0] + " " + arrN[T-1]);
		*/
		
		/*
		 *  방법2 [BufferedReader 배열]
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int index = 0;
		int[] arr = new int[N];
		while(st.hasMoreTokens()) {
			arr[index] = Integer.parseInt(st.nextToken());
			index++;
		}
		
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[N - 1]);
		*/
		
		/*
		 *  방법3 [배열 X]
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int max = -1000001;
		int min = 1000000;
		
		while (st.hasMoreTokens()) {
			int val = Integer.parseInt(st.nextToken());
			if(val > max) {
				max = val;
			}
			if(val < min) {
				min = val;
			}
		}	
		System.out.println(min + " " + max);
		
		
	}
}
