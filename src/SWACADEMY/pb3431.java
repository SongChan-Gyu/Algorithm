package SWACADEMY;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class pb3431 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(r.readLine());
		for(int test_case=1; test_case<=T; test_case++) {
			StringTokenizer t = new StringTokenizer(r.readLine());
			int num1 = Integer.parseInt(t.nextToken());
			int num2 = Integer.parseInt(t.nextToken());
			int num3 = Integer.parseInt(t.nextToken());
			
			int result=0;
			
			if(num2 < num3) {
				result = -1;
			}
			else {
				result = num1 - num3;
			}
			if(result<-1)
				result=0;
			System.out.println("#"+test_case+" "+result);
			
			
			
		}
		
		
	}
}
