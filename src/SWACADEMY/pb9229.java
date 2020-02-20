package SWACADEMY;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class pb9229 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(r.readLine());
		
		StringTokenizer st;
		int N,M;
		for(int test_case=1; test_case<=t; test_case++) {
			
			st = new StringTokenizer(r.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(r.readLine());
			int cnt = st.countTokens();
			int[] snack = new int[cnt];
			
			for(int i=0; i<cnt;i++) {
				snack[i] = Integer.parseInt(st.nextToken());
			}
			int verify = 0;
			int min =Integer.MIN_VALUE;
			int val;
			for(int i=0; i<cnt-1; i++) {
				for(int j=i+1; j<cnt; j++) {
					val = snack[i]+snack[j];
					if(val<=M && min<val) {
						min = val;
						verify++;
					}
				}
			}
			
			if(verify==0)
				System.out.println("#"+test_case+" -1");
			else
				System.out.println("#"+test_case+" "+min);
			
		}
		
	}

}
