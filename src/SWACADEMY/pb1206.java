package SWACADEMY;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 
 * 
 * @author ¼ÛÂù±Ô
 * @category D3
 * @since 2020-01-14
 */
public class pb1206 {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int T;
		for(int test_case =1; test_case <= 10; test_case++) {
			 T = Integer.parseInt(r.readLine());
			 StringTokenizer t = new StringTokenizer(r.readLine());
			 
			 int[] arr = new int[T];
			 
			 for(int i=0; i<T;i++) {
				 arr[i] = Integer.parseInt(t.nextToken());
			 }
			 
			 int cnt = 0;
			 int left = 0;
			 int right = 0;
			 for(int i =2; i<T-2;i++) {
				 left=0;
				 right=0;
				 if(arr[i-2]>=arr[i-1]) { 
					 if(arr[i]>arr[i-2]) 
						 left=arr[i]-arr[i-2];
				 }
				 else { 
					 if(arr[i]>arr[i-1]) 
						 left=arr[i]-arr[i-1];
				 }
				 if(arr[i+2]>=arr[i+1]) { 
					 if(arr[i]>arr[i+2]) 
						 right=arr[i]-arr[i+2];
				 }
				 else {
				 	 if(arr[i]>arr[i+1]) 
				 		 right=arr[i]-arr[i+1];	 
				 }
				 if(left>=right)
					 cnt+=right;
				 else
					 cnt+=left;
			 }
			 
			 System.out.println("#"+test_case+" "+cnt);
			 
			 
			 
		}

	}

}
