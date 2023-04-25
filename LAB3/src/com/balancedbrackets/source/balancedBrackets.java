package com.balancedbrackets.source;

import java.util.Stack;

public class balancedBrackets {
	
	public boolean isBalanced(String input) {
		Stack<Character> bracket_stack = new Stack<>();
		for (int bracket = 0 ; bracket < input.length(); bracket++) {
			char br = input.charAt(bracket);
			if (br == '(' || br == '[' || br == '{') {
				bracket_stack.push(br);
			}
			else if (br == ')' || br == ']' || br == '}') {
				if (bracket_stack.empty()) {
					return false;
				}
				char top = bracket_stack.pop();
				if ((br == ')' && top != '(') || (br == ']' && top != '[') || (br == '}' && top != '{')) {
					return false;
				}
			}
		}
		return bracket_stack.empty();
	}
}
