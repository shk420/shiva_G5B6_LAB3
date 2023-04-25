package com.balancedbrackets.driver;
import com.balancedbrackets.source.*;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		System.out.println("please enter the bracket string");
		Scanner inp = new Scanner(System.in);
		String input = inp.next();
		inp.close();
		
		balancedBrackets bb = new balancedBrackets();
		boolean isBalanced = bb.isBalanced(input);
		
		if (isBalanced) {
			System.out.println("The entered String has Balanced Brackets");
		}
		else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}
}
