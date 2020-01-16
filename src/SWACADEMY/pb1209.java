package SWACADEMY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 
 * @author ¼ÛÂù±Ô
 *
 */
public class pb1209 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		
		for(int test_case =1; test_case <= 10; test_case++) {
			
			int N = Integer.parseInt(r.readLine());
			String[][] array = new String[100][100];
			int[][] num = new int[100][100];
			StringTokenizer t; 
			for(int i=0;i<100;i++) {
				t = new StringTokenizer(r.readLine());
				for(int j =0; j<100; j++)
				array[i][j] = t.nextToken();
			}
			for(int i=0;i<100;i++) {
				for(int j=0;j<100;j++) {
					num[i][j] = Integer.parseInt(array[i][j]);
				}
			}
			int max =0;
			int temp=0;
			int temp2=0;
			for(int i=0; i<100; i++) {
				temp=0;
				temp2=0;
				for(int j=0; j<100; j++) {
					temp+=num[i][j];
					temp2+=num[j][i];
				}
				if(max<temp)
					max=temp;
				if(max<temp2)
					max=temp2;
			}
			
			temp =0;
			temp2 = 0;
			for(int i=0; i<100;i++) {
				temp +=num[i][i];
				temp2 += num[i][99-i];
			}
			if(max<temp)
				max=temp;
			if(max<temp2)
				max=temp2;
			
			
			System.out.println("#"+test_case+" "+max);
		}
	
	}
	
}
