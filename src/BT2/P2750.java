package BT2;

import java.util.Scanner;

public class P2750 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int temp;
		int[] arrNum = new int[N];
		
		for (int i = 0; i < N; i++) {
			arrNum[i] = sc.nextInt();
		}
		
		for(int i=0;i<N;i++){
		      for(int j=i+1;j<N;j++){
		        if(arrNum[i]>arrNum[j]){
		          temp=arrNum[i];
		          arrNum[i] = arrNum[j];
		          arrNum[j] = temp;
		        }
		      }
		    }

		    for(int i=0;i<N;i++){
		      System.out.println(arrNum[i]);
		    }

	}

}
