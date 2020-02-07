package SWACADEMY;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class pb1223 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		for(int test_case=1; test_case<=10; test_case++) {
			
			String num = r.readLine();
			String postfix = r.readLine();
			
			StringBuilder str = new StringBuilder();
			Stack<Character> stack = new Stack<Character>();
			Stack<Integer> answer = new Stack<Integer>();
			for(int i=0; i<postfix.length(); i++) {
				if(postfix.charAt(i)>='0' && postfix.charAt(i)<='9') {
					str.append(postfix.charAt(i));
					continue;
				}
				else if(postfix.charAt(i)=='+') {
					if(stack.empty())
						stack.add('+');
					else if(stack.peek()=='+') {
						str.append('+');
					}
					else if(stack.peek()=='*') {
						str.append(stack.pop());
						if(stack.empty()) {
							stack.add('+');
						}
						else if(stack.peek()=='+') {
							str.append(stack.pop());
							stack.add('+');
						}
						
							
					}
				}
				else if(postfix.charAt(i)=='*') {
					if(stack.empty())
						stack.add('*');
					else if(stack.peek()=='*') {
						str.append('*');
					}
					else if(stack.peek()=='+') {
						stack.add('*');
					}
					
				}
			}
			while(!stack.isEmpty())
				str.append(stack.pop());
			
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i)>='0' && str.charAt(i)<='9') {
					answer.add(str.charAt(i)-'0');
				}
				else if(str.charAt(i)=='+') {
					if(!answer.isEmpty()) {
						int temp = answer.pop();
						int temp2 = answer.pop();
						answer.add(temp+temp2);
					}
				}
				else if(str.charAt(i)=='*') {
					if(!answer.isEmpty()) {
						int temp = answer.pop();
						int temp2 = answer.pop();
						answer.add(temp*temp2);
					}
				}
			}
			
//			System.out.println(str);
//			System.out.println(stack);
//			System.out.println(answer.pop());
			System.out.println("#"+test_case+" "+answer.pop());
		}
	}
			
	
	
}
