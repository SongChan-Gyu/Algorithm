package SWACADEMY;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

/**
 * 
 * @author ¼ÛÂù±Ô
 * @category D3
 * @since 2020-01-14
 */
public class pb1244 {

	static int answer,n;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int T;
		T= Integer.parseInt(r.readLine());
		for(int test_case =1; test_case <= T; test_case++) {
			 String[] input = r.readLine().split(" ");
			 int swapCnt = Integer.parseInt(input[1]);
			 char[] tempChar = input[0].toCharArray();
			 n = tempChar.length;
			 int[] numArray = new int[n];
			 for(int i=0; i<n; i++) {
				 numArray[i] = tempChar[i] - 48;
			 }
			 
			 backtrack(0,numArray,swapCnt,0);
			
			 System.out.println("#"+test_case+" "+answer);
		}
		
	}
	
	static void backtrack (int left, int[] arr, int swapCnt, int cnt) {
		if(swapCnt == cnt) {
			answer = Math.max(answer,getNum(arr));
			return;
		}
		if(left==n-2) {
			swap(arr,left,left+1);
			backtrack(left,arr,swapCnt,cnt+1);
			return;
		}
		
		int max=0;
		int maxindex=0;
		for(int i=left; i<n; i++) {
			if(arr[i]>=max) {
				maxindex=i;
				max=arr[i];
			}
		}
		
		if(arr[left]==max) {
			backtrack(left+1,arr,swapCnt,cnt);
		}
		else {
			swap(arr,left,maxindex);
			backtrack(left+1,arr,swapCnt,cnt+1);
		}
		
		
		
		
	}
	
	static void swap(int[] arr, int i, int j) {
		    int temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
	}
	
	static int getNum(int[] arr) {
		int num = 0;
		for(int i=0; i<n;i++) {
			num += arr[i];
			if(i!=n-1)
				num*=10;
		}
		return num;
	}
	 

}
