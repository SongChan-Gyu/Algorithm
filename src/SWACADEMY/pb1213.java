package SWACADEMY;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class pb1213 {

	public static void main(String args[]) throws Exception{
		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		for(int test_case=1; test_case<=10; test_case++) {
			String num = r.readLine();
			String reg = r.readLine();
			String str = r.readLine();
			int count =0;
			for(int i=0; i<str.length(); i++) {
				if( (i=str.indexOf(reg,i)) >=0) {
					count++;
				}
				else 
					break;
					

			}
			
			
			
			System.out.println("#"+test_case+" "+count);
			
			
			
		}
		
		
	}
}
