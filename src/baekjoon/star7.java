package baekjoon;

import java.util.Scanner;

public class star7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i=1; i<N; i++) {
			for(int k=N-i; k>=1;k--) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
		for(int i=1; i<=N; i++) {
			for(int k=i; k>1; k--) {
				System.out.print(" ");
			}	
			for(int j=1; j<=2*(N-i+1)-1; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
}
