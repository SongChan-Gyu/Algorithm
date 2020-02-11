package SWACADEMY;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class pb1224 {

	
	
	public static int privority(char a) {
		if(a == '+')
			return 1;
		else if (a=='*')
			return 2;
		else
			return 0;
	}
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		
		for(int test_case=1; test_case<=10; test_case++) {
			int len = Integer.parseInt(r.readLine());
			String str = r.readLine();
			Stack<Integer> answer = new Stack<Integer>();
			Stack<Character> postStack = new Stack<Character>();
			Stack<Character> operStack = new Stack<Character>();
			StringBuilder postfix = new StringBuilder();
			char temp;
			for(int i=0; i<len; i++) {
				temp = str.charAt(i);
				if(temp>='0'&& temp<= '9') {
					postStack.push(temp);
				}
				else if(temp == '(') {
					operStack.push('(');
					
				}
				else if(temp == ')') {
					while(operStack.peek()!='(') {
						postStack.push(operStack.pop());
					}
					operStack.pop();
				}
				else{
					while(!operStack.isEmpty() && privority(temp) <= privority(operStack.peek())  ) {
						postStack.push(operStack.pop());
						if(operStack.isEmpty())
							break;
					}
					operStack.push(temp);
				}
					
			}
			while(!operStack.isEmpty()) {
				postStack.push(operStack.pop());
			}
			
			int x,y;
			Character[] st = new Character[postStack.size()];
			postStack.toArray(st);
			
			for(int i=0; i<postStack.size(); i++) {
				if(st[i]>='0' && st[i]<='9') {
					answer.push(st[i]-'0');
				}
				else if(st[i]=='+') {
					x = answer.pop();
					y = answer.pop();
					answer.push(x+y);
				}
				else if(st[i]=='*'){
					x = answer.pop();
					y = answer.pop();
					answer.push(x*y);
				}
			}
			
			System.out.println("#"+test_case+" "+answer.pop());
			
			
			
		}
		
	}
}
