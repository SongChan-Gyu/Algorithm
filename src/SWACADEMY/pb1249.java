package SWACADEMY;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class pb1249 {

		static int min = Integer.MAX_VALUE;
		public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T= Integer.parseInt(r.readLine());
		for(int test_case =1; test_case <= T; test_case++) {
			
			
			min = Integer.MAX_VALUE;
			int size = Integer.parseInt(r.readLine());
			int[][] table = new int[size][size];
			int[][] result = new int[size][size];
			char[] temp = new char[size];
			String row;
			for(int i=0; i<size; i++) {
				row = r.readLine();
				temp = row.toCharArray();
				for(int j=0; j<size; j++) {
					table[i][j] = temp[j]-'0';
					result[i][j] = Integer.MAX_VALUE;
				}
			}
			bfs(0,0,0,table,size-1,0,result);
			
			System.out.println("#"+test_case+" "+min);
			
			
			
			
		}
		
		
	}
		
	static void bfs(int row, int column,int count, int[][] table, int size, int backlog, int[][] result) {
		
		if(result[row][column] > count)
			result[row][column] = count;
		else
			return;
		
		
		if(row==size && column == size) {
			if(min > count)
				min = count;
			return;
		}
		if(min < count)
			return;
		
		
		if(row>0 && backlog != 3)
			bfs(row-1,column,count+table[row-1][column],table,size,1,result);
		if(column<size && backlog != 4)
			bfs(row,column+1,count+table[row][column+1],table,size,2,result);
		if(row<size && backlog != 1)
			bfs(row+1,column,count+table[row+1][column],table,size,3,result);
		if(column>0 && backlog != 2)
			bfs(row,column-1,count+table[row][column-1],table,size,4,result);
		
		
		
	}
	
	
}
