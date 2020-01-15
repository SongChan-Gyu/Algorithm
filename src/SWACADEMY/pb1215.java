package SWACADEMY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class pb1215 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		
		for(int test_case =1; test_case <= 10; test_case++) {
			 int N = Integer.parseInt(r.readLine());
			 StringTokenizer t; 
			 char[][] array = new char[8][8];
			 for(int i =0 ; i<8; i++) {
				 t = new StringTokenizer(r.readLine());
				 array[i] = t.nextToken().toCharArray();
			 }
			 int cnt = 0;
			 boolean flag;
			 for(int h=0; h<8-N+1; h++) {
				 for(int i=0;i<8;i++) {
					 flag=true;
					 for(int j=0;j<N/2;j++)
						 if(array[i][h+j]!=array[i][h+N-1-j]) {
							 flag=false;
							 break;
						 }
					 if(flag)
						 cnt++;
					 flag=true;
					 for(int j=0;j<N/2;j++)
						 if(array[h+j][i]!=array[h+N-1-j][i]) {
							 flag=false;
							 break;
						 }
					 if(flag)
						 cnt++;
					 
				 }
				 
				 
			 }
			 System.out.println("#"+test_case+" "+cnt);
			 
			 
			 
				 
			
			
		}
	}

}
