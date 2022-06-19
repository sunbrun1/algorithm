package ST5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P2693 {

	public static void main(String[] args) throws IOException {
		/*
		 * 방법1 Scanner
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[10];
		int[] result = new int[n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < A.length; j++) {
				A[j] = sc.nextInt();			
			}
			Arrays.sort(A);
			result[i] = A[7];
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);			
		}
		*/
		
		
		/*
		 * 방법2 
		 * 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tc = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<tc; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=0; j<10; j++) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			Collections.sort(list);
			bw.write(String.valueOf(list.get(7)+"\n"));
			list.clear();
		}
		
		
		bw.flush();
		br.close();
		bw.close();

	}

}
