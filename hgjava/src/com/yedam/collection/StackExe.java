package com.yedam.collection;

import java.util.Stack;

public class StackExe {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("1번");
		stack.push("2번");
		stack.push("3번");
		stack.push("4번");
		showStackInfo(stack);
		
		String value = stack.pop();
		showStackInfo(stack);
		
		stack.push(value);
		showStackInfo(stack);
	}
	static void showStackInfo(Stack<String> _stack)
	{
		System.out.println(_stack.size());
		for(String ele : _stack)
		{
			System.out.println(ele);
		}
	}
}
