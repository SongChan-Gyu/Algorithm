package SWACADEMY;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class pb7964 {
	
	/**
	 * @author ¼ÛÂù±Ô
	 * @param 7964
	 * @category D3
	 * 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
	    int T;
	    T = Integer.parseInt(r.readLine());

		int gate=0;
		int cnt=0;
		for(int test_case =1; test_case <= T; test_case++) {
			
			StringTokenizer t = new StringTokenizer(r.readLine());
			int N = Integer.parseInt(t.nextToken());
            int D = Integer.parseInt(t.nextToken());
  
            gate=0;
            cnt=0;
            t = new StringTokenizer(r.readLine());
            for(int i=0; i<N; i++) {
				if(t.nextToken().equals("0")) {
					cnt++;
					continue;
				}
				else {
					gate+=(int)cnt/D;
					cnt=0;
					continue;
				}
			}
			gate+=(int)cnt/D;
			System.out.println("#" + test_case + " " + gate);
		}
		
		

		
	}

}