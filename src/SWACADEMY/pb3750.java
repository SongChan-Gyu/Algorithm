package SWACADEMY;

import java.util.Scanner;

public class pb3750 {
	
	public static void main(String args[]) throws Exception
	{
	
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            long n = sc.nextLong();
            long num=0;
            while(n>=10) {
            	for(long i=n; i>0; i=i/10) {
   	            	num+=i%10;
   	            	
   	        	}
               	n=num;
               	num=0;
            }
            
            System.out.println("#"+test_case+" "+n);
	         
            
		}
		
	}
	

	
	
}
