package SWACADEMY;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class pb8104 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
	    int T;
	    T = Integer.parseInt(r.readLine());

	    for(int test_case = 1; test_case <= T; test_case++) {
	    	
	    	StringTokenizer t = new StringTokenizer(r.readLine());
			int N = Integer.parseInt(t.nextToken());
            int K = Integer.parseInt(t.nextToken());
            int sum = 0;
            int c = 1;
            int s = 0;
            int h = 0;
            for(int i=c ; i<= K*N ; i=c) {
            	sum += c;
            	
            	if(s==0) {
            		h= h+2;
            		c= h*K;
            		s=1;
            	}
            	else {
            		s=0;
            		c+=1;
            	}
            }
            
            System.out.print("#"+test_case);
            for(int j = 0; j<K; j++)
            	System.out.print(" "+sum);
            System.out.println();
	    	
	    
	    }
	}
}
