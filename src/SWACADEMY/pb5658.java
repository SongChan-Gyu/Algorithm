package SWACADEMY;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 
 * @author ������
 *
 *	5658. [���� SW �����׽�Ʈ] �������� ��й�ȣ
 *
 *
 *	
 *
 *	�� ���� ������ ���� 16���� ����(0~F)�� ���� �ִ� �������ڰ� �ִ�.	
	
	���� ������ �Ѳ��� �ð�������� ���� �� �ְ�, �� �� ���� ������ ���ڰ� �ð�������� �� ĭ�� ȸ���Ѵ�.
	
	�� ������ ������ ������ ���ڰ� �ְ�, �ð���� ������ ���� �ڸ� ���ڿ� �ش��ϸ� �ϳ��� ���� ��Ÿ����.
	
	���� ��� [Fig.1]�� ���� 1A3, B54, 8F9, D66�̰�, [Fig.2]�� ���� 61A, 3B5, 48F, 9D6�̴�.
	
	�������ڿ��� �ڹ��谡 �ɷ��ִµ�, �� �ڹ����� ��й�ȣ�� ���� ���ڿ� ���� ���ڷ� ���� �� �ִ� ��� �� ��, K��°�� ū ���� 10�� ���� ���� ���̴�.
	
	N���� ���ڰ� �Է����� �־����� ��, ���������� ��� ��ȣ�� ����ϴ� ���α׷��� ������.
	
	(���� �ٸ� ȸ�� Ƚ������ ������ ���� �ߺ����� ������ �� �ִ�. ũ�� ������ �� �� ���� ���� �ߺ����� ���� �ʵ��� �����Ѵ�.)

	%test case
	5					// �׽�Ʈ ���̽��� ���� T = 5
	12 10				// 1��° �׽�Ʈ ���̽�, N=12, K=10
	1B3B3B81F75E		// N���� ����
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
			for(int i=1; i<N/4; i++) { //ȸ�� for��
				
				for(int j=0; j<4; j++) {
					
				}
				
				char tempChar = list.get(0);
				list.remove(0);
				list.add(tempChar);
			}
			
			
		}
		
	}
	
	
}
