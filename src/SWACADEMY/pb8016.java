package SWACADEMY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pb8016 {

	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(r.readLine());
		
		for(int test_case = 1; test_case<= T; test_case++) {
			
			long N = Integer.parseInt(r.readLine());
			
			if(N==1) 
				System.out.println("#"+test_case+" 1 1");
			else
				System.out.println("#"+test_case+" "+( 1+4*(N-1)*(N-1)-(2*N-2)*(N-1) ) +" "+ ( -1+4*(N)*(N)-(2*N)*(N) ) );
			
		}
	}
}
