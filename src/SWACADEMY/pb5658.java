package SWACADEMY;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 
 * @author 송찬규
 *
 *	5658. [모의 SW 역량테스트] 보물상자 비밀번호
 *
 *
 *	
 *
 *	각 변에 다음과 같이 16진수 숫자(0~F)가 적혀 있는 보물상자가 있다.	
	
	보물 상자의 뚜껑은 시계방향으로 돌릴 수 있고, 한 번 돌릴 때마다 숫자가 시계방향으로 한 칸씩 회전한다.
	
	각 변에는 동일한 개수의 숫자가 있고, 시계방향 순으로 높은 자리 숫자에 해당하며 하나의 수를 나타낸다.
	
	예를 들어 [Fig.1]의 수는 1A3, B54, 8F9, D66이고, [Fig.2]의 수는 61A, 3B5, 48F, 9D6이다.
	
	보물상자에는 자물쇠가 걸려있는데, 이 자물쇠의 비밀번호는 보물 상자에 적힌 숫자로 만들 수 있는 모든 수 중, K번째로 큰 수를 10진 수로 만든 수이다.
	
	N개의 숫자가 입력으로 주어졌을 때, 보물상자의 비밀 번호를 출력하는 프로그램을 만들어보자.
	
	(서로 다른 회전 횟수에서 동일한 수가 중복으로 생성될 수 있다. 크기 순서를 셀 때 같은 수를 중복으로 세지 않도록 주의한다.)

	%test case
	5					// 테스트 케이스의 개수 T = 5
	12 10				// 1번째 테스트 케이스, N=12, K=10
	1B3B3B81F75E		// N개의 숫자
	16 2
	F53586D76286B2D8


 */
public class pb5658 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(r.readLine());
		
		
		for(int test_case=1; test_case<=1; test_case++) {
			
			StringTokenizer st = new StringTokenizer(r.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(r.readLine());
			String num = st.nextToken();
			int a = N/4;
			List<Character> list = new LinkedList<Character>();
			
			for(int i=0; i<num.length(); i++) {
				list.add(num.charAt(i));
			}
			String[] numStr = new String[4];
			String temp="";
			for(int i=1; i<N/4; i++) { //회전 for문
				
				for(int j=0; j<4; j++) {
					
				}
				
				char tempChar = list.get(0);
				list.remove(0);
				list.add(tempChar);
			}
			
			
		}
		
	}
	
	
}
