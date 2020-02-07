package SWACADEMY;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class pb1494 {

	
	public static void main(String[] args) throws Exception {
	
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(r.readLine());
		for(int test_case =1; test_case <= T; test_case++) {
			
			int n = Integer.parseInt(r.readLine());
			StringTokenizer token;
			int[][] xy = new int[n][2];
			for(int i=0; i<n; i++) {
				token = new StringTokenizer(r.readLine());
				xy[n][0] = Integer.parseInt(token.nextToken());
				xy[n][1] = Integer.parseInt(token.nextToken());
			}
			
			
			
		}
		
		
		
	}
	
}
