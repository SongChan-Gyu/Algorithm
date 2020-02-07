package SWACADEMY;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class pb1234 {
	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		for(int test_case =1; test_case <= 10; test_case++) {
			String[] ex = r.readLine().split(" ");
			String length = ex[0];
			String number = ex[1];
			boolean flag = true;
			while(flag){
				
				int len = number.length();
				for(int i=0; i<len-1; i++) {
					if(number.charAt(i)==number.charAt(i+1)) {
						number = number.substring(0,i) + number.substring(i+2,len);
						flag=true;
						break;
					}
					if(i==len-2) {
						flag=false;
					}
				}
				
				
				
			}
			System.out.println("#"+test_case+" "+number);
			
			
			
			
			
			
		}
	}
}
